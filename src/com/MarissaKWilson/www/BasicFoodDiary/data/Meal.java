package com.MarissaKWilson.www.BasicFoodDiary.data;

import java.util.ArrayList;

public class Meal implements DataObject {
    ArrayList<Food> frequent;
    ArrayList<Food> food;
    Nutrient nutrition;
    String name;

    public Meal(){}

    public Meal(String name, Nutrient nutrition, ArrayList<Food> food, ArrayList<Food> frequent) {
        this.name = name;
        this.nutrition = nutrition;
        this.food = food;
        this.frequent = frequent;
    }

    public ArrayList<Food> getFrequent() {
        return frequent;
    }

    public void setFrequent(ArrayList<Food> frequent) {
        this.frequent = frequent;
    }

    public ArrayList<Food> getFood() {
        return food;
    }

    public void setFood(ArrayList<Food> food) {
        this.food = food;
    }

    public Nutrient getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrient nutrition) {
        this.nutrition = nutrition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
