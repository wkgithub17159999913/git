package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.User;

@RestController
public class HelloController {
	@Autowired
	private User u1 ;
	@RequestMapping("/hello")
	public Object test() {
		return "Hello SpringBoot";
	}
	@RequestMapping("/user")
	public User getUser() {
		User u = new User(u1.getName(), u1.getPassword(), u1.getAge(), u1.getTime(), u1.getId());
//		u.setTime(new Date());
//		SimpleDateFormat sdf= new SimpleDateFormat("YYYY-MM-dd a HH:mm:ss E");
//		String ate = sdf.format(new Date());
//		u.setPassword(ate);
//		u.setName("张三444");
		
		return u;
	}
}