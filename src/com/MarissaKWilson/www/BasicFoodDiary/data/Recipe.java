package com.MarissaKWilson.www.BasicFoodDiary.data;

import java.util.ArrayList;

public class Recipe implements DataObject {
    Object ingr[];
    ArrayList<Object[]> ingredients;
    Nutrient nutrition;
    int servings;
    int servingSize;
    String servingUnit;

    public Recipe(){}

    public Recipe(Object ingr[], ArrayList<Object[]> ingredients, Nutrient nutrition, int servings,
                  int servingSize, String servingUnit) {
        this.ingr = ingr;
        this.ingredients = ingredients;
        this.nutrition = nutrition;
        this.servings = servings;
        this.servingSize = servingSize;
        this.servingUnit = servingUnit;
    }

    public Object[] getIngr() {
        return ingr;
    }

    public void setIngr(Object[] ingr) {
        this.ingr = ingr;
    }

    public ArrayList<Object[]> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Object[]> ingredients) {
        this.ingredients = ingredients;
    }

    public Nutrient getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrient nutrition) {
        this.nutrition = nutrition;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public String getServingUnit() {
        return servingUnit;
    }

    public void setServingUnit(String servingUnit) {
        this.servingUnit = servingUnit;
    }


}
