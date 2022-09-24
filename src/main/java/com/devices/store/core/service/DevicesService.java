package com.devices.store.core.service;

import com.devices.store.common.entity.*;
import com.devices.store.common.responses.DeviceResponse;

public interface DevicesService {

    DeviceResponse getDevices();
    
    DeviceResponse getDevices(String version, String platform);

    DeviceResponse addDevice(Device d);
}
