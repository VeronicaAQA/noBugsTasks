package org.example.task4;

public class Clock implements Readable {
    private int hour;
    private int min;
    private int sec;

    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMin(int min){
        this.min = min;
    }
    public void setSec(int sec){
        this.sec = sec;
    }

    public int getHour(){
        return this.hour;
    }
    public int getMin(){
        return this.min;
    }
    public int getSec(){
        return this.sec;
    }

    public void tick() {
        sec += 1;
        if (sec >= 60) {
            sec -= 60;
            min += 1;
            }
            if (min >= 60) {
                min -= 60;
                hour += 1;
            }
        }


    @Override
    public void readTime() {
        System.out.println("Текущее время " + this.hour + ":" + this.min + ":" + this.sec);
    }
    }
