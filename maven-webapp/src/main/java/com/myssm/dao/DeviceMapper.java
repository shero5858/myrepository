package com.myssm.dao;

import java.util.List;

import com.myssm.entity.Device;

public interface DeviceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKeyWithBLOBs(Device record);

    int updateByPrimaryKey(Device record);
    
    List<Device> selectAllDevice();
}