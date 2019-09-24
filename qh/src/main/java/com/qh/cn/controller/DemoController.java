package com.qh.cn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qh.cn.beans.ResultBean;
import com.qh.cn.entity.Student;
import com.qh.cn.service.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value = "1.xxxxx", tags = { "xxxx" })
public class DemoController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String test() {
		return "index";
	}
	
	@GetMapping("/queryStudentList")
	@ApiOperation(value = "1、xxx", notes = "xxxx")
	@ResponseBody
	public ResultBean<List<Student>> queryStudentList() {
		return new ResultBean<List<Student>>(studentService.queryStudentList());
	}
	
	

}
