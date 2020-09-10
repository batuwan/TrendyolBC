
package com.mycompany._notificationhub;

import com.mycompany._notificationhub.Packs.Pack;

public class Company {
    
    private String companyName;
    private String phoneNumber;
    private String emailAddress;
    private Pack emailPack;
    private Pack smsPack;
    private int countEmail = 0;
    private int countSms = 0;
    private Language language;

    public Company(String companyName, String phoneNumber, String emailAddress, Pack emailPack, Pack smsPack, Language language) {
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.emailPack = emailPack;
        this.smsPack = smsPack;
        this.language = language;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Pack getEmailPack() {
        return emailPack;
    }

    public void setEmailPack(Pack emailPack) {
        this.emailPack = emailPack;
    }

    public Pack getSmsPack() {
        return smsPack;
    }

    public void setSmsPack(Pack smsPack) {
        this.smsPack = smsPack;
    }

    public int getCountEmail() {
        return countEmail;
    }

    public void setCountEmail(int countEmail) {
        this.countEmail = countEmail;
    }

    public int getCountSms() {
        return countSms;
    }

    public void setCountSms(int countSms) {
        this.countSms = countSms;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
    
    public void increaseCountSms(){
        
        countSms++;
    }
    
    public void increaseCountEmail(){
        
        countEmail++;
    }
    
}
