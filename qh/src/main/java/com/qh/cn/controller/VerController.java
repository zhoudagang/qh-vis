package com.qh.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VerController {

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/a")
	@ResponseBody
	public String a() {
		return "a";
	}

}
