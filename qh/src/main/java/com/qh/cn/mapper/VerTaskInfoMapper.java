package com.qh.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.qh.cn.entity.VerificationTaskInfo;

public interface VerTaskInfoMapper extends BaseMapper<VerificationTaskInfo> {

	@Select(" SELECT verification_task_number,task_start_date,task_end_date,task_type,aog_batch,specification,modbus,task_num,verified_quantity,qualified_num,dis_qualified_num,verification_person,check_person FROM VERIFICATION_TASK ")
	List<VerificationTaskInfo> queryPage(IPage<VerificationTaskInfo> page);
}
