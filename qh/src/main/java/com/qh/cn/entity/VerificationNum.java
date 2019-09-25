package com.qh.cn.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VerificationNum {

	@ApiModelProperty("检定计划数量")
	private int verificationPlanNum;

	@ApiModelProperty("检定完成数量")
	private int verificationFinishNum;

	@ApiModelProperty("百分比")
	private String percent;
}
