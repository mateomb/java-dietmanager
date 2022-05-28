package rit.swen.dietmanagerg1.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rit.swen.dietmanagerg1.view.DietView;
import rit.swen.dietmanagerg1.model.DietModel;

public class DietController {

    private DietModel model;
    private DietView view;

    public DietController(DietModel model, DietView view) {
        this.model = model;
        this.view = view;
        // Listeners for the buttons
        model.convertFood();
        model.convertLog();
        //calorie count
        view.setjTextArea1(model.getFoods().getCalories() + "g");
        //set up counter for amount of foods later
        //food name
        view.setjTextArea2(model.getFoods().getName() + "");
        //weight (from log)
        view.setjTextArea3(model.getLog().getCount() + "");
        //division of nutrition
        view.setjTextArea4("Fat: " + model.getFoods().getFat() + "g      Carbs: " + model.getFoods().getCarb() + "g      Protein: " + model.getFoods().getProtein() + "g");
        System.out.println(model.getFoods());
        System.out.println(model.getLog());
    
        view.jButton3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            model.saveFood(view.selectYear(), view.selectMonth(), view.selectDay(), model.getFoods().getType(), model.getFoods().getName(), 1);
        }
    });
    }
      
}
    
  
