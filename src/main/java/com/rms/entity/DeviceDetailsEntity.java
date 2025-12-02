package com.rms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "DeviceDetails",schema="dbo")
public class DeviceDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "SiteID")
    private Integer siteID;

    @Column(name = "DeviceType")
    private String deviceType;

    @Column(name = "DeviceName")
    private String deviceName;

    @Column(name = "IPAddress")
    private String ipAddress;

    @Column(name = "IsActive")
    private boolean isActive;

    @Column(name = "SNMPVersion")
    private String SNMPVersion;

    @Column(name = "Community")
    private String Community;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

    @Column(name = "UpdatedDate")
    private LocalDateTime updatedDate;


}
