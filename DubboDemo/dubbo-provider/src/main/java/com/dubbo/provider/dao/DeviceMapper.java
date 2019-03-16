package com.dubbo.provider.dao;

import java.util.List;

import com.dubbo.api.entity.Device;
import com.dubbo.api.service.DemoService;

public interface DeviceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DemoService record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKeyWithBLOBs(Device record);

    int updateByPrimaryKey(Device record);
    
    List<Device> findAllDevice();
}