package com.MarissaKWilson.www.BasicFoodDiary.data;

import java.util.ArrayList;
import java.util.Date;

public class Day implements DataObject {
    Date date;
    float weight;
    ArrayList<Meal> meals;
    Nutrient nutrition;

    public Day (){
        date = new Date();
    }
    public Day (Date date, float weight, ArrayList<Meal> meals, Nutrient nutrition){
        this.date = (date != null) ? date : new Date();
        this.weight = weight;
        this.meals = meals;
        this.nutrition = nutrition;
    }

    public boolean setWeight(float weight){
        this.weight = weight;
        return true;
    }

    public float getWeight() {
        return weight;
    }

    public Date getDate(){
        return date;
    }

    public String getStringDate(){
        return date.toString();
    }

    public ArrayList<Meal> getMeals(){
        return meals;
    }

    public boolean setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
        return true;
    }

    public Nutrient getNutrition() {
        return nutrition;
    }

    public boolean setNutrition(Nutrient nutrition) {
        this.nutrition = nutrition;
        return true;
    }
}
