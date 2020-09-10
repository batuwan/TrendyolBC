package com.mycompany._notificationhub;

public class Invoice {

    private Company company;
    private double fee = 0;
    private int owedMonths = 0;
    private boolean blackListed = false;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getOwedMonths() {
        return owedMonths;
    }

    public void setOwedMonths(int owedMonths) {
        this.owedMonths = owedMonths;
    }

    public boolean isBlackListed() {
        blackListed = owedMonths >= 2;
        return blackListed;
    }

    public void setBlackListed(boolean blackListed) {
        this.blackListed = blackListed;
    }

}
