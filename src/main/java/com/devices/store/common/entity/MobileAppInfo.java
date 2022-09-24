package com.devices.store.common.entity;

import com.devices.store.common.consts.enums.AppPlatform;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mobile_application_info")
public class MobileAppInfo {

    @Id
    @SequenceGenerator(name = "MAPPINFO_SEC", initialValue = 1, allocationSize = 1, sequenceName = "MAPPINFO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MAPPINFO")
    @Column(name = "id")
    private Long id;

    @Column(name = "app_version", nullable = false)
    private String appVersion;

    @Column(name = "app_build_id")
    private String appBuildId;

    @Column(name = "app_release_date")
    private String appReleaseDate;
    
    @Column(name = "app_platform", nullable = true)
    private AppPlatform appPlatform;
    
}
