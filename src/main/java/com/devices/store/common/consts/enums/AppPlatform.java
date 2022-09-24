package com.devices.store.common.consts.enums;

public enum AppPlatform {

    IOS(0), ANDROID(1);

    private int devide_platform;

    AppPlatform(int devide_platform) {
        this.devide_platform = devide_platform;
    }

	public int getDevide_platform() {
		return devide_platform;
	}

  

}
