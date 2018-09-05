package com.example.ss12dark.dianaproject;

public class Recipe {
    private String  name;
    private String rec;
    private int time;
    private int calo;
    private String image;
    private int rate;

    public Recipe(String name, String rec, int time, int calo, String image, int rate) {
        this.name = name;
        this.rec = rec;
        this.time = time;
        this.calo = calo;
        this.image = image;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getRec() {
        return rec;
    }

    public int getTime() {
        return time;
    }

    public int getCalo() {
        return calo;
    }

    public String getImage() {
        return image;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate){
        this.rate = rate;
    }
}
