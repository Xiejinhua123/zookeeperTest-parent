package com.zookeeper.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface StudentService {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public  String login() throws  Exception;
	
	@RequestMapping(value = "/getStucent", method = RequestMethod.GET)
	public String getStudent() throws Exception;
	
}
