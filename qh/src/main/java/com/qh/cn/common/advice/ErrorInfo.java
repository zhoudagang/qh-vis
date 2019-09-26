package com.qh.cn.common.advice;

import lombok.Data;

@Data
public class ErrorInfo {
	private Integer code;
	private String message;
	private String url;
}
