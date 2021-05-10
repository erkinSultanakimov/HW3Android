package com.geekchtech.hw2android;

public class Data {
    private String number;
    private String title;
    private String smallTitle;
    private String date;

    public Data(String number, String title, String smallTitle, String date) {
        this.number = number;
        this.title = title;
        this.smallTitle = smallTitle;
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSmallTitle() {
        return smallTitle;
    }

    public void setSmallTitle(String smallTitle) {
        this.smallTitle = smallTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
