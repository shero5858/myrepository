package com.dubbo.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.dubbo.api.entity.Device;
import com.dubbo.api.service.DemoService;
import com.dubbo.provider.dao.DeviceMapper;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DeviceMapper deviceMapper;

	@Override
	public String getFirstDemo() {
		return "this is the first dubbo demo";
	}


	@Override
	public String selectAllDevices() {
		List<Device> list = deviceMapper.findAllDevice();
		return JSON.toJSONString(list,SerializerFeature.WriteMapNullValue);	
	}


	@Override
	public List<Device> findAllDevObjs() {
		return deviceMapper.findAllDevice();
	}
}
