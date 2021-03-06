package com.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	HelloService helloService;

	@RequestMapping("/hi")
	@ResponseBody
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}
}
