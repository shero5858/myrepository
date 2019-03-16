package com.myssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.myssm.dao.DeviceMapper;
import com.myssm.entity.Device;
import com.myssm.service.DeviceService;
@Service
public class DeviceServiceImpl implements DeviceService{
	
	@Autowired
	private DeviceMapper deviceMapper;

	@Override
	public String selectAllDevices() {
		
		List<Device> list = deviceMapper.selectAllDevice();
		return JSON.toJSONString(list,SerializerFeature.WriteMapNullValue);	
	}
	
}
