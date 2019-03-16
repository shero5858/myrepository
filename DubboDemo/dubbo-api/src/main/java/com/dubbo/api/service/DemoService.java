package com.dubbo.api.service;

import java.util.List;

import com.dubbo.api.entity.Device;

public interface DemoService {

	public String getFirstDemo();
	
	public String selectAllDevices();
	
	public List<Device> findAllDevObjs();
}
