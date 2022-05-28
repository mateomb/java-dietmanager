package rit.swen.dietmanagerg1.model;
//unused for now, found a way to perform functionality elsewhere instead

public class FoodFactory {
    
    public static Food get(FoodType type) {
        switch (type) {
            case BASICFOOD:
                //return new BasicFood();
            case RECIPE:
                //return new Recipe();
            default:
                return null;
        }
    }

}
