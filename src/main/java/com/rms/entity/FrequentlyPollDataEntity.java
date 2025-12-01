package com.rms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "FrequentlyPollData")
public class FrequentlyPollDataEntity {

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

    @Column(name = "BusVoltage")
    private String busVoltage;

    @Column(name = "Current")
    private String current;

    @Column(name = "RectCount")
    private String rectCount;

    @Column(name = "ActRect")
    private String actRect;

    @Column(name = "RectCurrent")
    private String rectCurrent;

    @Column(name = "RectStatus1")
    private String rectStatus1;
    @Column(name = "RectStatus2")
    private String rectStatus2;
    @Column(name = "RectStatus4")
    private String rectStatus3;
    @Column(name = "RectStatus4")
    private String rectStatus4;
    @Column(name = "RectStatus5")
    private String rectStatus5;
    @Column(name = "RectStatus6")
    private String rectStatus6;
    @Column(name = "RectStatus7")
    private String rectStatus7;

    @Column(name = "RectAlarm1")
    private String rectAlarm1;
    @Column(name = "RectAlarm2")
    private String rectAlarm2;
    @Column(name = "RectAlarm3")
    private String rectAlarm3;
    @Column(name = "RectAlarm")
    private String rectAlarm4;
    @Column(name = "RectAlarm5")
    private String rectAlarm5;
    @Column(name = "RectAlarm6")
    private String rectAlarm6;
    @Column(name = "RectAlarm7")
    private String rectAlarm7;

    @Column(name = "RectVersion1")
    private String rectVersion1;
    @Column(name = "RectVersion2")
    private String rectVersion2;
    @Column(name = "RectVersion3")
    private String rectVersion3;
    @Column(name = "RectVersion4")
    private String rectVersion4;
    @Column(name = "RectVersion5")
    private String rectVersion5;
    @Column(name = "RectVersion6")
    private String rectVersion6;
    @Column(name = "RectVersion7")
    private String rectVersion7;

    @Column(name = "RectRInVolt1")
    private String rectRInVolt1;
    @Column(name = "RectRInVolt2")
    private String rectRInVolt2;
    @Column(name = "RectRInVolt3")
    private String rectRInVolt3;
    @Column(name = "RectRInVolt4")
    private String rectRInVolt4;
    @Column(name = "RectRInVolt5")
    private String rectRInVolt5;
    @Column(name = "RectRInVolt6")
    private String rectRInVolt6;
    @Column(name = "RectRInVolt7")
    private String rectRInVolt7;

    @Column(name = "RectRInCurr1")
    private String rectRInCurr1;
    @Column(name = "RectRInCurr2")
    private String rectRInCurr2;
    @Column(name = "RectRInCurr3")
    private String rectRInCurr3;
    @Column(name = "RectRInCurr4")
    private String rectRInCurr4;
    @Column(name = "RectRInCurr5")
    private String rectRInCurr5;
    @Column(name = "RectRInCurr6")
    private String rectRInCurr6;
    @Column(name = "RectRInCurr7")
    private String rectRInCurr7;


    @Column(name = "RectTemp1")
    private String rectTemp1;
    @Column(name = "RectTemp2")
    private String rectTemp2;
    @Column(name = "RectTemp3")
    private String rectTemp3;
    @Column(name = "RectTemp4")
    private String rectTemp4;
    @Column(name = "RectTemp5")
    private String rectTemp5;
    @Column(name = "RectTemp6")
    private String rectTemp6;
    @Column(name = "RectTemp7")
    private String rectTemp7;

    @Column(name = "ACRPhaseVolt")
    private String acrPhaseVolt;
    @Column(name = "ACYPhaseVolt")
    private String acyPhaseVolt;
    @Column(name = "ACBPhaseVolt")
    private String acbPhaseVolt;

    @Column(name = "ACRPhaseCurr")
    private String acrPhaseCurr;
    @Column(name = "ACYPhaseCurr")
    private String acyPhaseCurr;
    @Column(name = "ACBPhaseCurr")
    private String acbPhaseCurr;


    @Column(name = "ACNuCurr")
    private String acNuCurr;

    @Column(name = "ACRFreq")
    private String acrFreq;

    @Column(name = "ACYFreq")
    private String acyFreq;

    @Column(name = "ACBFreq")
    private String acbFreq;

    @Column(name = "EBKWh")
    private String ebKwh;

    @Column(name = "EbRunHrs")
    private String ebRunHrs;

    @Column(name = "DGKWh")
    private String dgKwh;

    @Column(name = "DGRunHrs")
    private String dgRunHrs;

    @Column(name = "LoadCurr")
    private String loadCurr;

    @Column(name = "LoadKWh")
    private String loadKwh;

    @Column(name = "LoadStatus1")
    private String loadStatus1;

    @Column(name = "LoadCurr1")
    private String loadCurr1;

    @Column(name = "LoadKwh1")
    private String loadKwh1;

    @Column(name = "LoadVoltage1")
    private String loadVoltage1;

    @Column(name = "LoadStatus2")
    private String loadStatus2;

    @Column(name = "LoadCurr2")
    private String loadCurr2;

    @Column(name = "LoadKwh2")
    private String loadKwh2;

    @Column(name = "LoadVoltage2")
    private String loadVoltage2;

    @Column(name = "LoadStatus3")
    private String loadStatus3;

    @Column(name = "LoadCurr3")
    private String loadCurr3;

    @Column(name = "LoadKwh3")
    private String loadKwh3;

    @Column(name = "LoadVoltage3")
    private String loadVoltage3;

    @Column(name = "LoadStatus4")
    private String loadStatus4;

    @Column(name = "LoadCurr4")
    private String loadCurr4;

    @Column(name = "LoadKwh4")
    private String loadKwh4;

    @Column(name = "LoadVoltage4")
    private String loadVoltage4;

    @Column(name = "SolarRecStatus1")
    private String solarRectStatus1;
    @Column(name = "SolarRecStatus2")
    private String solarRectStatus2;
    @Column(name = "SolarRecStatus3")
    private String solarRecStatus3;
    @Column(name = "SolarRecStatus4")
    private String solarRecStatus4;

    @Column(name = "SolarInputVoltage1")
    private String solarInputVoltage1;
    @Column(name = "SolarInputVoltage2")
    private String solarInputVoltage2;
    @Column(name = "SolarInputVoltage3")
    private String solarInputVoltage3;
    @Column(name = "SolarInputVoltage4")
    private String solarInputVoltage4;

    @Column(name = "SolarRecInputCurr1")
    private String solarRecInputCurr1;
    @Column(name = "SolarRecInputCurr2")
    private String solarRecInputCurr2;
    @Column(name = "SolarRecInputCurr3")
    private String solarRecInputCurr3;
    @Column(name = "SolarRecInputCurr4")
    private String solarRecInputCurr4;

    @Column(name = "SolarRecInputVolt1")
    private String solarRecInputVolt1;
    @Column(name = "SolarRecInputVolt2")
    private String solarRecInputVolt2;
    @Column(name = "SolarRecInputVolt3")
    private String solarRecInputVolt3;
    @Column(name = "SolarRecInputVolt4")
    private String solarRecInputVolt4;

    @Column(name = "SolarRecOPVolt1")
    private String solarRecOpVolt1;
    @Column(name = "SolarRecOPVolt2")
    private String solarRecOpVolt2;
    @Column(name = "SolarRecOPVolt3")
    private String solarRecOpVolt3;
    @Column(name = "SolarRecOPVolt4")
    private String solarRecOpVolt4;

    @Column(name = "SolarRecOPCurr1")
    private String solarRecOpCurr1;
    @Column(name = "SolarRecOPCurr2")
    private String solarRecOpCurr2;
    @Column(name = "SolarRecOPCurr3")
    private String solarRecOpCurr3;
    @Column(name = "SolarRecOPCurr4")
    private String solarRecOpCurr4;

    @Column(name = "SolarOPKwh1")
    private String solarOpKwh1;
    @Column(name = "SolarOPKwh2")
    private String solarOpKwh2;
    @Column(name = "SolarOPKwh3")
    private String solarOpKwh3;
    @Column(name = "SolarOPKwh4")
    private String solarOpKwh4;

    @Column(name = "BattChargeCycle")
    private String battChargeCycle;

    @Column(name = "BattDischargeCycle")
    private String battDischargeCycle;

    @Column(name = "NumberOfBatt")
    private String numberOfBatt;

    @Column(name = "TotBatteryCurr")
    private String totBatteryCurr;

    @Column(name = "BatteryTemp")
    private String batteryTemp;

    @Column(name = "BatteryVolt")
    private String batteryVolt;


    @Column(name = "BattCurr")
    private String battCurr;

    @Column(name = "SOCBattery")
    private String socBattery;

    @Column(name = "BatteryStatus")
    private String batteryStatus;

    @Column(name = "ActiveLiIon")
    private String activeLiIon;

    @Column(name = "ModuleCap")
    private String moduleCap;

    @Column(name = "LiIonBankCap")
    private String liIonBankCap;

    @Column(name = "LiIonBusVolt")
    private String LiIonBusVolt;

    @Column(name = "LiionTemp")
    private String liIonTemp;

    @Column(name = "LiIonManufacture")
    private String liIonManuFacture;


    @Column(name = "LIionStatus1")
    private String liIonStatus1;
    @Column(name = "LIionStatus2")
    private String liIonStatus2;
    @Column(name = "LIionStatus3")
    private String liIonStatus3;
    @Column(name = "LIionStatus4")
    private String liIonStatus4;
    @Column(name = "LIionStatus5")
    private String liIonStatus5;
    @Column(name = "LIionStatus6")
    private String liIonStatus6;
    @Column(name = "LIionStatus7")
    private String liIonStatus7;
    @Column(name = "LIionStatus8")
    private String liIonStatus8;


    @Column(name = "LiIonVolt1")
    private String liIonVolt1;
    @Column(name = "LiIonVolt2")
    private String liIonVolt2;
    @Column(name = "LiIonVolt3")
    private String LiIonVolt3;
    @Column(name = "LiIonVolt4")
    private String liIonVolt4;
    @Column(name = "LiIonVolt5")
    private String liIonVolt5;
    @Column(name = "LiIonVolt6")
    private String liIonVolt6;
    @Column(name = "LiIonVolt7")
    private String liIonVolt7;
    @Column(name = "LiIonVolt8")
    private String liIonVolt8;

    @Column(name = "LiIonCurrent1")
    private String liIonCurrent1;
    @Column(name = "LiIonCurrent2")
    private String liIonCurrent2;
    @Column(name = "LiIonCurrent3")
    private String liIonCurrent3;
    @Column(name = "LiIonCurrent4")
    private String liIonCurrent4;
    @Column(name = "LiIonCurrent5")
    private String liIonCurrent5;
    @Column(name = "LiIonCurrent6")
    private String liIonCurrent6;
    @Column(name = "LiIonCurrent7")
    private String liIonCurrent7;
    @Column(name = "LiIonCurrent8")
    private String liIonCurrent8;


    @Column(name = "LiIonTemp1")
    private String liIonTemp1;
    @Column(name = "LiIonTemp2")
    private String liIonTemp2;
    @Column(name = "LiIonTemp3")
    private String liIonTemp3;
    @Column(name = "LiIonTemp4")
    private String liIonTemp4;
    @Column(name = "LiIonTemp5")
    private String liIonTemp5;
    @Column(name = "LiIonTemp6")
    private String liIonTemp6;
    @Column(name = "LiIonTemp7")
    private String liIonTemp7;
    @Column(name = "LiIonTemp8")
    private String liIonTemp8;

    @Column(name = "LiIonSOC1")
    private String liIonSoc1;
    @Column(name = "LiIonSOC2")
    private String liIonSoc2;
    @Column(name = "LiIonSOC3")
    private String liIonSoc3;
    @Column(name = "LiIonSOC4")
    private String liIonSoc4;
    @Column(name = "LiIonSOC5")
    private String liIonSoc5;
    @Column(name = "LiIonSOC6")
    private String liIonSoc6;
    @Column(name = "LiIonSOC7")
    private String liIonSoc7;
    @Column(name = "LiIonSOC8")
    private String liIonSoc8;

    @Column(name = "SolarTotalRecCurrent")
    private String solarTotalRecCurrent;

    @Column(name = "SolarCumulativeRunhrs")
    private String solarCumlativeRunhrs;

    @Column(name = "SystemOverload")
    private String systemOverLoad;

    @Column(name = "PreUnderVoltage")
    private String preUnderVoltage;

    @Column(name = "BattLvdVoltage")
    private String battLvdVoltage;

    @Column(name = "BattTemperatureHigh")
    private String battTemperatureHigh;

    @Column(name = "BattBankDischarge")
    private String battBankDischarge;

    @Column(name = "AllBatteryFuseFail")
    private String allBatteryFuseFail;

    @Column(name = "LiIonBattCommFail")
    private String liIonBattCommFail;

    @Column(name = "MainsFail")
    private String mainsFail;

    @Column(name = "RecFailFlag")
    private String recFailFlag;

    @Column(name = "MultipleRecFail")
    private String multipleRecFail;

    @Column(name = "SolarRecFail")
    private String solarRecFail;

    @Column(name = "MultipleSolarRecFail")
    private String multipleSolarRecFail;

    @Column(name = "PollTime")
    private String pollTime;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;


}
