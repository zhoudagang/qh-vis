package com.qh.cn.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.qh.cn.beans.ResultBean;
import com.qh.cn.common.exceptions.CheckException;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class AopController {

	@Pointcut(value = "execution(public com.qh.cn.beans.ResultBean *(..)))")
	public void handlerResultBeanMethod() {
	}

	@Around("handlerResultBeanMethod()")
	public Object handlerResultBeanMethod(ProceedingJoinPoint pjp) {

		long startTime = System.currentTimeMillis();
		ResultBean<?> result;
		try {
			result = (ResultBean<?>) pjp.proceed();
			log.info(pjp.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));
		} catch (Throwable e) {
			result = handlerException(pjp, e);
		}

		return result;
	}

	private ResultBean<?> handlerException(ProceedingJoinPoint pjp, Throwable e) {
		@SuppressWarnings("rawtypes")
		ResultBean<?> result = new ResultBean();
		// 已知异常
		if (e instanceof CheckException) {
			result.setMsg(e.getLocalizedMessage());
			result.setCode(ResultBean.FAIL);
		} else {
			log.error(pjp.getSignature() + " error ", e);
			result.setMsg(e.toString());
			result.setCode(ResultBean.FAIL);
		}

		return result;
	}

}
