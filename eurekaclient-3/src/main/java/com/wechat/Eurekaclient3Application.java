package com.wechat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableEurekaClient
@Controller
public class Eurekaclient3Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaclient3Application.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	@ResponseBody
	public String home(@RequestParam String name) {
		return "hi " + name + ",1231232i am from port:" + port;
	}
}
