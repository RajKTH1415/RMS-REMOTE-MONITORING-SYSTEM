package com.rms.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "DailyOncePollData", schema="dbo")
public class DailyOncePollDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DeviceID")
    private Integer deviceID;

    @Column(name = "DeviceSiteID")
    private Integer deviceSiteID;

    @Column(name = "IPAddress")
    private String ipAddress;

    @Column(name = "DeviceModel")
    private String deviceModel;

    @Column(name = "SiteID")
    private String siteID;

    @Column(name = "SystemVersion")
    private String systemVersion;

    @Column(name = "SwVer")
    private String swVer;

    @Column(name = "RectSerialNo1")
    private String rectSerialNo1;
    @Column(name = "RectSerialNo2")
    private String rectSerialNo2;
    @Column(name = "RectSerialNo3")
    private String rectSerialNo3;
    @Column(name = "RectSerialNo4")
    private String rectSerialNo4;
    @Column(name = "RectSerialNo5")
    private String rectSerialNo5;
    @Column(name = "RectSerialNo6")
    private String rectSerialNo6;
    @Column(name = "RectSerialNo7")
    private String rectSerialNo7;


    @Column(name = "AcPhaseType")
    private String acPhaseType;
    @Column(name = "VrlBattCap")
    private String vrlaBattCap;

    @Column(name = "BatteryType")
    private String batteryType;
    @Column(name = "NoOfLoadPath")
    private String noOfLoadPath;
    @Column(name = "NoOfLvd")
    private String noOfLvd;

    @Column(name = "SolarRectSerialNo1")
    private String solarRectSerialNo1;
    @Column(name = "SolarRectSerialNo2")
    private String solarRectSerialNo2;
    @Column(name = "SolarRectSerialNo3")
    private String solarRectSerialNo3;
    @Column(name = "SolarRectSerialNo4")
    private String solarRectSerialNo4;

    @Column(name = "NoLiIon")
    private String noLiIon;

    @Column(name = "PollTime")
    private LocalDateTime pollTime;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;
}
