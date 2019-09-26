package com.qh.cn.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.qh.cn.entity.VerificationNum;
import com.qh.cn.entity.VerificationTaskInfo;

public interface VerService {

	VerificationNum getVerificationNum();

	IPage<VerificationTaskInfo> queryPage(int pageNo, int pageSize);

}
