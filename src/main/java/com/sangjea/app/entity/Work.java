package com.sangjea.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Work {
    @Id
    @GeneratedValue
    private Long id;

    private String position;
    private String company;
    private String time;
    private String desc;

    public Work() {

    }

    public Work(String position, String company, String time, String desc) {
        this.position = position;
        this.company = company;
        this.time = time;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public String getCompany() {
        return company;
    }

    public String getTime() {
        return time;
    }

    public String getDesc() {
        return desc;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
