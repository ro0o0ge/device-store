package com.ws.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devices.store.common.entity.Device;
import com.devices.store.common.requests.DeviceRequest;
import com.devices.store.common.responses.DeviceResponse;
import com.devices.store.core.service.DevicesService;

@RestController
@RequestMapping("/device")
public class DeviceRestController {

    @Autowired
    private DevicesService devicesService;

    @GetMapping("/getDevices")
    @PreAuthorize("BACKOFFICE")//?
    public DeviceResponse getUserDevices(@RequestParam String appVersion, @RequestParam String appPlatform){
    	if(appVersion == null && appPlatform == null)
    		return devicesService.getDevices();
    	else 
    		return devicesService.getDevices();
    }

    @PostMapping("/addDevice")
    @PreAuthorize("")//certain user ?
    public DeviceResponse addUserDevice(@RequestBody DeviceRequest device){
    	// some validations & checks
    	Device d = new Device(device.getDevice_id(), device.getOs_version(), device.getDevice_manufacturer(), device.getDevice_model(),
    			device.getDevice_name());
        return devicesService.addDevice(d);
    }
    
    

}
