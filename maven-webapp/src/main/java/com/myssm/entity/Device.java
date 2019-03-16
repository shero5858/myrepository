package com.myssm.entity;

import java.util.Date;

public class Device {
    private Long id;

    private String name;

    private String chname;

    private Integer status;

    private String sysoid;

    private String logoip;

    private Integer port;

    private String location;

    private String contact;

    private String enterprise;

    private String entOid;

    private String version;

    private Boolean ifmanage;

    private String mac;

    private Boolean ifimport;

    private String ifMac;

    private String serialnum;

    private Date operationTime;

    private String desr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getChname() {
        return chname;
    }

    public void setChname(String chname) {
        this.chname = chname == null ? null : chname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSysoid() {
        return sysoid;
    }

    public void setSysoid(String sysoid) {
        this.sysoid = sysoid == null ? null : sysoid.trim();
    }

    public String getLogoip() {
        return logoip;
    }

    public void setLogoip(String logoip) {
        this.logoip = logoip == null ? null : logoip.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise == null ? null : enterprise.trim();
    }

    public String getEntOid() {
        return entOid;
    }

    public void setEntOid(String entOid) {
        this.entOid = entOid == null ? null : entOid.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Boolean getIfmanage() {
        return ifmanage;
    }

    public void setIfmanage(Boolean ifmanage) {
        this.ifmanage = ifmanage;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public Boolean getIfimport() {
        return ifimport;
    }

    public void setIfimport(Boolean ifimport) {
        this.ifimport = ifimport;
    }

    public String getIfMac() {
        return ifMac;
    }

    public void setIfMac(String ifMac) {
        this.ifMac = ifMac == null ? null : ifMac.trim();
    }

    public String getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(String serialnum) {
        this.serialnum = serialnum == null ? null : serialnum.trim();
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getDesr() {
        return desr;
    }

    public void setDesr(String desr) {
        this.desr = desr == null ? null : desr.trim();
    }
}