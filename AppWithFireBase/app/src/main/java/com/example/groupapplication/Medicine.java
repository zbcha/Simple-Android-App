package com.example.groupapplication;

public class Medicine {
    String name;
    String dosage;
    String time;
    String times;

    public Medicine() {
    }

    public Medicine(String name, String dosage, String time, String times) {
        this.name = name;
        this.dosage = dosage;
        this.time = time;
        this.times = times;
    }

    public void setName(String Name) {
        this.name = name;
    }
    public void setDosage(String dosage) {
        this.dosage=dosage;
    }
    public void setTime(String time){
        this.time=time;
    }
    public void setTimes(String times){
        this.times=time;
    }
    public String getName(){
        return this.name;
    }
    public String getDosage(){
        return this.dosage;
    }
    public String getTime(){
        return this.time;
    }
    public String getTimes(){
        return this.times;
    }
}
