package com.devices.store.common.responses;

import com.devices.store.common.entity.*;

import java.util.ArrayList;

public class DeviceResponse extends ResponseHeader{

    private ArrayList<Device> devices;

    public DeviceResponse() {
    }

    public DeviceResponse(ArrayList<Device> devices) {
        this.devices = devices;
    }

	public ArrayList<Device> getDevices() {
		return devices;
	}

	public void setDevices(ArrayList<Device> devices) {
		this.devices = devices;
	}   
}
