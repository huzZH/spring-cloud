package com.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wechat.interfac.SchedualServiceHi;

public class HiController {
	@Autowired
	SchedualServiceHi schedualServiceHi;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam String name) {
		return schedualServiceHi.sayHiFromClientOne(name);
	}
}
