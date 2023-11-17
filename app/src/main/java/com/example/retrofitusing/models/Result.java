package com.example.retrofitusing.models;

class Result {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String geturl() {
        return url;
    }

    public void seturl(String value) {
        this.url = value;
    }

    public String getNumber() {
        String[] urlPartes = url.split("/");
        return urlPartes[urlPartes.length - 1];
    }
}
