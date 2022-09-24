package com.devices.store.core.service;

import com.devices.store.common.entity.Device;
import com.devices.store.common.responses.DeviceResponse;
import com.devices.store.integration.repos.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevicesServiceImpl implements DevicesService{

    @Autowired
    private DeviceRepository deviceRepository;

	public DeviceResponse getDevices() {
		// TODO Auto-generated method stub
		return null;
	}

	public DeviceResponse addDevice(Device d) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeviceResponse getDevices(String version, String platform) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
