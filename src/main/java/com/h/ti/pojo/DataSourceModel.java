package com.h.ti.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class DataSourceModel {

    private String dsid;
    private String dsType;
    private String dsName;
    private String username;
    private String password;
    private String url;
    private String driverClassName;

    private String creator;
    private String updator;
    private Date createTime;
    private Date updateTime;


    @Override
    public String toString() {
        return "DataSourceModel{" +
                "dsid='" + dsid + '\'' +
                ", dsType='" + dsType + '\'' +
                ", dsName='" + dsName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                ", creator='" + creator + '\'' +
                ", updator='" + updator + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
