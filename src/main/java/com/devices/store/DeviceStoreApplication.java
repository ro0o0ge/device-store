package com.devices.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources(value = {
        @PropertySource(value = "classpath:application.properties")
})
public class DeviceStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceStoreApplication.class, args);
	}

}
