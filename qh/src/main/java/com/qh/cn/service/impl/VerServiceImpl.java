package com.qh.cn.service.impl;

import java.text.NumberFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qh.cn.entity.VerificationNum;
import com.qh.cn.entity.VerificationTaskInfo;
import com.qh.cn.mapper.VerMapper;
import com.qh.cn.mapper.VerTaskInfoMapper;
import com.qh.cn.service.VerService;

@Service
public class VerServiceImpl implements VerService {

	@Autowired
	private VerMapper verMapper;

	@Autowired
	private VerTaskInfoMapper verTaskInfoMapper;

	@Override
	public VerificationNum getVerificationNum() {
		VerificationNum num = verMapper.getNum();
		num.setPercent(deciMal(num.getVerificationFinishNum(), num.getVerificationPlanNum()));
		return num;
	}

	@Override
	public IPage<VerificationTaskInfo> findByPage(Page<VerificationTaskInfo> page) {
		return verTaskInfoMapper.selectPage(page, null);
	}

	private String deciMal(int top, int below) {
		NumberFormat numberFormat = NumberFormat.getInstance();
		// 设置精确到小数点后2位
		numberFormat.setMaximumFractionDigits(2);
		String result = numberFormat.format((float) top / (float) below * 100);
		return result + "%";
	}

}
