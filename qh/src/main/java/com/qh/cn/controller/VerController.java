package com.qh.cn.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qh.cn.beans.ResultBean;
import com.qh.cn.entity.VerificationNum;
import com.qh.cn.entity.VerificationTaskInfo;
import com.qh.cn.service.VerService;

@Controller
public class VerController {

	@GetMapping("/index")
	public String index() {
		return "home";
	}

	@Autowired
	private VerService verService;

	@GetMapping("/queryVerNum")
	@ResponseBody
	public ResultBean<VerificationNum> queryVerNum(HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		return new ResultBean<VerificationNum>(verService.getVerificationNum());
	}

	@GetMapping(value = "/queryVerTaskPage")
	@ResponseBody
	public ResultBean<IPage<VerificationTaskInfo>> queryVerTaskPage(HttpServletResponse response,
			@RequestParam(value = "pageNo", required = true) int pageNo,
			@RequestParam(value = "pageSize", required = true) int pageSize) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		Page<VerificationTaskInfo> page = new Page<>(pageNo, pageSize);
		return new ResultBean<IPage<VerificationTaskInfo>>(verService.findByPage(page));
	}

}
