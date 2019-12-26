package com.everjiankang.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.everjiankang.springcloud.entity.Dept;

@FeignClient(value="MICROSERVICECLOUD-DEPT") //微服务名称
public interface DeptService {
	
	@RequestMapping(value = "/consumer/dept/add",method=RequestMethod.POST)
	public boolean add(Dept dept);

	@RequestMapping(value = "/consumer/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(Long id);

	@RequestMapping(value = "/consumer/dept/list",method=RequestMethod.GET)
	public List<Dept> list();
}
