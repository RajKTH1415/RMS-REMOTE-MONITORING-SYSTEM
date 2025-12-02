package com.rms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TrapLogs")
public class TrapLogsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DeviceID")
    private Integer deviceId;

    @Column(name = "SiteID")
    private Integer siteId;

    @Column(name = "IPAddress")
    private String ipAddress;

    @Column(name = "Version")
    private String version;

    @Column(name = "TrapOID")
    private String trapOid;

    @Column(name = "VariablesInformation")
    private String variablesInformation;

    @Column(name = "ReceivedTime")
    private LocalDateTime receivedTime;

    @Column(name = "VB1")
    private String vB1;

    @Column(name = "VB2")
    private String vB2;

    @Column(name = "VB3")
    private String vB3;

    @Column(name = "VB4")
    private String vB4;

    @Column(name = "VB5")
    private String vB5;

    @Column(name = "VB6")
    private String vB6;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;



}
