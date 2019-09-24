package com.qh.cn.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("t_stu")
public class Student {

	private int stuId;
	private String stuName;
	private String stuSex;
	
}