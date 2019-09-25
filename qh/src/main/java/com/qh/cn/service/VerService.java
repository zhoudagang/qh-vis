package com.qh.cn.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qh.cn.entity.VerificationNum;
import com.qh.cn.entity.VerificationTaskInfo;

public interface VerService {

	VerificationNum getVerificationNum();

	IPage<VerificationTaskInfo> findByPage(Page<VerificationTaskInfo> page);

}
