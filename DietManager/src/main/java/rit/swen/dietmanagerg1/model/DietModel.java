package rit.swen.dietmanagerg1.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DietModel {

    String COMMA_DELIMITER = ",";

    ArrayList<BasicFood> foods;
    BasicFood basicFood;
    Recipe recipe;

    ArrayList<Log> log;
    Log newLog;
    Log createLog;
    
    public void convertFood(){
        try{
        foods = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader("assets/foods.csv"))){
        String line;
        while ((line = br.readLine()) != null){
            String[] valArray = line.split(COMMA_DELIMITER);

            if(valArray[0].equals("b")){
                basicFood = new BasicFood(valArray[0].charAt(0), valArray[1], Double.parseDouble(valArray[2]), Double.parseDouble(valArray[3]), Double.parseDouble(valArray[4]), Double.parseDouble(valArray[5]));
            }

            /*
            if(valArray[0].equals("r")){
                for(int i = 0; i< valArray.length; i++){
                    recipe = new Recipe();
               }

                recipe = new Recipe(valArray[0].charAt(0), valArray[1], );
            }
            */

            foods.add(basicFood);
        }//end of WHILE

        }//end of BufferedReader
    }catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("An IO exception occured in convertFood() method");
        }
        
    }//end of convertFood

    public void convertLog(){
        try{
        log = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader("assets/log.csv"))){
        String line;
        while ((line = br.readLine()) != null){
            String[] valArray = line.split(COMMA_DELIMITER);

            if(!(valArray[3].equals("f"))){
                newLog = new Log(Integer.parseInt(valArray[0]),Integer.parseInt(valArray[1]),Integer.parseInt(valArray[2]), valArray[3].charAt(0), Double.parseDouble(valArray[4]));
            }
            else{
                newLog = new Log(Integer.parseInt(valArray[0]),Integer.parseInt(valArray[1]),Integer.parseInt(valArray[2]), valArray[3].charAt(0), valArray[4],Double.parseDouble(valArray[5]));
            }
            

            log.add(newLog);
            //log.add(Arrays.asList(valArray));
        }//end of WHILE

        }//end of BufferedReader
    }catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("An IO exception occured in convertlog() method");
        }
        
    }//end of convertLog
    
    public void createFood(char type, String name, double calories, double fat, double carb, double protein) {
        BasicFood newFood = new BasicFood(type, name, calories, fat, carb, protein);
        foods.add(newFood);
    }
    
    // Implement Recipe - Varargs
    /*
    public void createRecipe(char type, double ... recipe, double ... recipe2)        
    */
    
    public void createLog(int year, int month, int day, char type, double count) {
        Log newLog = new Log(year,month,day,type,count);
        log.add(newLog);
    }
    
    //testing output via printing to terminal
    //add int parameter to allow user to pick food entry in testing
    public BasicFood getFoods() {
        return foods.get(4);
    }

    public Log getLog() {
        return log.get(0);
    }

    public void saveFood(int year,int month,int day,char type,String name,double count) {
        Log createLog = new Log(year,month,day,type,name,count);
         try{
        log = new ArrayList<>();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("assets/log.csv",true))){
            bw.newLine();
            bw.write(String.valueOf(createLog.year));
            bw.write(COMMA_DELIMITER);
            bw.write(String.valueOf(createLog.month));
            bw.write(COMMA_DELIMITER);
            bw.write(String.valueOf(createLog.day));
            bw.write(COMMA_DELIMITER);
            bw.write(String.valueOf(createLog.type));
            bw.write(COMMA_DELIMITER);
            bw.write(createLog.name);
            bw.write(COMMA_DELIMITER);
            bw.write(String.valueOf(createLog.count));
            System.out.println("Food " + createLog.getName() + " is saved");
            bw.close();
            }//end of BufferedReader
        }catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("An IO exception occured in saveFood() method");
        }
    }
   
}




