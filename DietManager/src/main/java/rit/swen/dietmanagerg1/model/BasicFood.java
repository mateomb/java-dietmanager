package rit.swen.dietmanagerg1.model;

public class BasicFood implements Food{
    char type;
    String name;
    double calories;
    double fat;
    double carb;
    double protein;

    BasicFood(char type, String name, double calories, double fat, double carb, double protein){
        this.type = type;
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.carb = carb;
        this.protein = protein;
    }

    //getters
    public char getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public double getCalories(){
        return calories;
    }

    public double getFat(){
        return fat;
    }

    public double getCarb(){
        return carb;
    }

    public double getProtein(){
        return protein;
    }

    //setters
    public void setType(char newType){
        this.type = newType;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setCalories(double newCalories){
        this.calories = newCalories;
    }

    public void setFat(double newFat){
        this.fat = newFat;
    }

    public void setCarb(double newCarb){
        this.carb = newCarb;
    }

    public void setProtein(double newProtein){
        this.protein = newProtein;
    }

    //other methods
    public void process(String type){
        System.out.println("Food type is: " + type);
    }

    @Override
    public String toString(){
        return type + "," + name + "," + calories + "," + fat + "," + carb + "," + protein;
    }


}
