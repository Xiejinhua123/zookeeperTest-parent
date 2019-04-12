package com.xiejinhua.zookeeperTest.service.impl;

import org.springframework.stereotype.Component;

import com.xiejinhua.zookeeperTest.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {

	@Override
	public String login() {
		return "执行出错了";
	}

	@Override
	public String getStudent() throws Exception {
		return "执行出错了";
	}

}
