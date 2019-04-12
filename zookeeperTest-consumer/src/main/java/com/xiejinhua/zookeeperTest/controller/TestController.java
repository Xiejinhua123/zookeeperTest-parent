package com.xiejinhua.zookeeperTest.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiejinhua.zookeeperTest.service.StudentService;

@RestController
public class TestController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/test")
	public String test() {
		Long start = new Date().getTime();
		Long time = null;
		String result = null;
		try {
			result = this.studentService.login();
		}catch (Exception e) {
			e.printStackTrace();
			result = "controller执行出错";
		}finally {
			Long end = new Date().getTime();
			time = end - start;
		}
		result = result + " ===》 执行耗时:" + time;
		System.out.println( result );
		return result;
	}
	
	@RequestMapping(value = "/getStucent", method = RequestMethod.GET)
	public String getStudent() {
		try {
			return this.studentService.getStudent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "出错了";
	}
	
}
