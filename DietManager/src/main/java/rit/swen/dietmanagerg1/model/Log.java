package rit.swen.dietmanagerg1.model;

public class Log {
    int day;
    int month;
    int year;
    char type;
    String name;
    double count;

    Log(int year, int month, int day, char type, String name, double count){      
        this.year = year;
        this.month = month;
        this.day = day;
        this.type = type;
        this.name = name;
        this.count = count;
    }

    Log(int year, int month, int day, char type, double count){      
        this.year = year;
        this.month = month;
        this.day = day;
        this.type = type;
        this.count = count;
    }

    //getters
    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public char getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public double getCount(){
        return count;
    }

    //setters
    public void setDay(int newDay){
        this.day = newDay;
    }

    public void setMonth(int newMonth){
        this.month = newMonth;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }

    public void setType(char newType){
        this.type = newType;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setCount(double newCount){
        this.count = newCount;
    }

    //other methods
    @Override
    public String toString(){
        return year + "," + month + "," + day + "," + type + "," + name + "," + (count + "");
    }

}
