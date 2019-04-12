package com.zookeeper.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author  xiejinhua
 * @date 2019-04-12
 * @version 1.0
 *
 */
public interface StudentService {
	/**
	 * 执行登录操作
	 * @return
	 * 		执行结果
	 * @throws Exception
	 * 		可能出现的异常信息
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public  String login() throws  Exception;

	/**
	 * 获取同一个学生细腻
	 * @return
	 * 		执行结果
	 * @throws Exception
	 * 		可能出现的异常信息
	 */
	@RequestMapping(value = "/getStucent", method = RequestMethod.GET)
	public String getStudent() throws Exception;
	
}
