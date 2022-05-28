package rit.swen.dietmanagerg1.runnable;

import rit.swen.dietmanagerg1.view.DietView;
import rit.swen.dietmanagerg1.controller.DietController;
import rit.swen.dietmanagerg1.model.DietModel;

public class DietTester {

    public static void main(String[] args) {
        DietModel model = new DietModel();
        DietView view = new DietView();
        view.setVisible(true);
        DietController controller = new DietController(model, view);
    }
}