package com.qh.cn.entity;

import lombok.Data;

@Data
public class VerificationTaskInfo {

	// 检定任务单号
	private String VerificationTaskNumber;

	// 任务开始日期
	private String TaskStartDate;

	// 任务结束日期
	private String TaskEndDate;

	// 任务类型
	private String TaskType;

	// 到货批次
	private String AogBatch;

	// 设备规格
	private String Specification;

	// 通讯规约
	private String Modbus;

	// 任务数量
	private String TaskNum;

	// 已检定数量
	private String VerifiedQuantity;

	// 合格数量
	private String QualifiedNum;

	// 不合同数量
	private String DisQualifiedNum;

	// 检定人员
	private String VerificationPerson;

	// 核验人员
	private String CheckPerson;

}
