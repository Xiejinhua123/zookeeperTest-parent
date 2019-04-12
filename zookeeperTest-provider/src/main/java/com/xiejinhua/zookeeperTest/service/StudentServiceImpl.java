package com.xiejinhua.zookeeperTest.service;

import org.springframework.web.bind.annotation.RestController;

import com.zookeeper.service.StudentService;

@RestController
public class StudentServiceImpl implements StudentService {

	@Override
	public String login() throws Exception {
		System.out.println("a");
        return "用户已验证";
    }

	@Override
	public String getStudent() throws Exception {
		return "{\"name\":\"123\"}";
	}

	
}
