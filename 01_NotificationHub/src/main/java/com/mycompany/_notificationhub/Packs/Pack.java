package com.mycompany._notificationhub.Packs;

public abstract class Pack {

    double fee;
    int maxQuota;
    double unitFee;

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getMaxQuota() {
        return maxQuota;
    }

    public void setMaxQuota(int maxQuota) {
        this.maxQuota = maxQuota;
    }

    public double getUnitFee() {
        return unitFee;
    }

    public void setUnitFee(double unitFee) {
        this.unitFee = unitFee;
    }

    
}
