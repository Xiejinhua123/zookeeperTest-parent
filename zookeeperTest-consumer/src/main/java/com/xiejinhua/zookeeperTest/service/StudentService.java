package com.xiejinhua.zookeeperTest.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.xiejinhua.zookeeperTest.service.impl.StudentServiceImpl;

@FeignClient(value="zookeeperTest",fallback=StudentServiceImpl.class)
public interface StudentService extends com.zookeeper.service.StudentService {

}
