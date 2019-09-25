package com.qh.cn.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VerificationTaskInfo {

	@ApiModelProperty("检定任务单号")
	private String verificationTaskNumber;

	@ApiModelProperty("任务开始日期")
	private String taskStartDate;

	@ApiModelProperty("任务结束日期")
	private String taskEndDate;

	@ApiModelProperty("任务类型")
	private String taskType;

	@ApiModelProperty("到货批次")
	private String aogBatch;

	@ApiModelProperty("设备规格")
	private String specification;

	@ApiModelProperty("通讯规约")
	private String modbus;

	@ApiModelProperty("任务数量")
	private String taskNum;

	@ApiModelProperty("已检定数量")
	private String verifiedQuantity;

	@ApiModelProperty("合格数量")
	private String qualifiedNum;

	@ApiModelProperty("不合同数量")
	private String disQualifiedNum;

	@ApiModelProperty("检定人员")
	private String verificationPerson;

	@ApiModelProperty("核验人员")
	private String checkPerson;

}
