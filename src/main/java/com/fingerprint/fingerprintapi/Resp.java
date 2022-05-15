package com.fingerprint.fingerprintapi;

public class Resp {
    public boolean isExisted;
    public String name;

    public boolean isExisted() {
        return isExisted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExisted(boolean existed) {
        isExisted = existed;
    }

    public Resp() {
        this.isExisted = false;
        this.name = "";
    }
}
