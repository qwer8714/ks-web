package com.sangjea.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SocialMedia {

    @Id
    @GeneratedValue
    private Long id;
    private String github;
    private String instagram;

    public SocialMedia() {

    }

    public SocialMedia(String github, String instagram) {
        this.github = github;
        this.instagram = instagram;
    }

    public Long getId() {
        return id;
    }

    public String getGithub() {
        return github;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
}

