package com.devices.store.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "devices")
public class Device {

    @Id
    @SequenceGenerator(name = "DEVICES_SEQ", initialValue = 1, allocationSize = 1, sequenceName = "DEVICES_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEVICES_SEQ")
    private Long id;

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "os_version")
    private String osVersion;

    @Column(name = "device_manufacturer")
    private String deviceManufacturer;
    
    @Column(name = "device_model")
    private String deviceModel;

    @Column(name = "device_name")
    private String deviceName;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "mob_app_id", nullable = false)
    private MobileAppInfo mobAppInfo;

	public Device(String deviceId, String osVersion, String deviceManufacturer, String deviceModel, String deviceName) {
		super();
		this.deviceId = deviceId;
		this.osVersion = osVersion;
		this.deviceManufacturer = deviceManufacturer;
		this.deviceModel = deviceModel;
		this.deviceName = deviceName;
	}

	
	
	
}
