package com.rms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "SiteDetails")
public class SiteDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "SiteID")
    private String siteId;

    @Column(name = "SiteName")
    private String siteName;

    @Column(name = "CompanyID")
    private Integer companyId;

    @Column(name = "IsActive")
    private boolean isActive;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

    @Column(name = "UpdatedDate")
    private LocalDateTime updatedDate;

    @Column(name = "targetEnergy(kw)")
    private String targetEnergyKw;



}
