package rit.swen.dietmanagerg1.model;

import java.util.ArrayList;

public class Recipe implements Food{
    char type;
    String recipeName;
    ArrayList<String> foodNames;
    ArrayList<Double> count;

    Recipe(char type, String recipeName, ArrayList<String> foodNames, ArrayList<Double>count){
        this.type = type;
        this.recipeName = recipeName;
        this.foodNames = foodNames;
        this.count = count;
    }

    @Override
    public void process(String type){
        System.out.println("Recipe type is: " + type);
    }

}
