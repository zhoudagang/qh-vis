package com.qh.cn.mapper;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qh.cn.entity.VerificationNum;

public interface VerMapper extends BaseMapper<VerificationNum> {

	@Select("SELECT * FROM VERIFICATION ")
	VerificationNum getNum();

}
