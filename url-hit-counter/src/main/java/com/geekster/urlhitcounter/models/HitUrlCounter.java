package com.geekster.urlhitcounter.models;

public class HitUrlCounter {
    private String userName;
    private  int hitCount;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public HitUrlCounter(String userName, int hitCount) {
        this.userName = userName;
        this.hitCount = hitCount;
    }

    public HitUrlCounter() {
    }
}
