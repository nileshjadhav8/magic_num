package com.nus.iss.workshop1241.workshop1241.model;

public class Image {
    private String name;

    private String url;

    public Image(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image [name=" + name + ", url=" + url + "]";
    }

}
