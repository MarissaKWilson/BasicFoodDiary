package com.MarissaKWilson.www.BasicFoodDiary.data;

public class Food implements DataObject {
    String name;
    Nutrient nutrition;
    float servingSize;
    float servings;

    public Food(){}

    public Food(String name, Nutrient nutrition, float servingSize, float servings) {
        this.name = name;
        this.nutrition = nutrition;
        this.servingSize = servingSize;
        this.servings = servings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Nutrient getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrient nutrition) {
        this.nutrition = nutrition;
    }
    public float getServingSize() {
        return servingSize;
    }

    public void setServingSize(float servingSize) {
        this.servingSize = servingSize;
    }

    public float getServings() {
        return servings;
    }

    public void setServings(float servings) {
        this.servings = servings;
    }

}
