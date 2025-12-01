package com.rms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "FailedPoll")
public class FailedPollEntity {

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

    @Column(name = "OID")
    private String oid;

    @Column(name = "Name")
    private String name;

    @Column(name = "Type")
    private String type;

    @Column(name = "Error")
    private String error;

    @Column(name = "Date")
    private LocalDateTime date;
}
