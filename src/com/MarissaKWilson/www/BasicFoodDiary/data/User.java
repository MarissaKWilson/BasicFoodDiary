package com.MarissaKWilson.www.BasicFoodDiary.data;

import java.util.ArrayList;

public class User implements DataObject {
    float curWeight;
    float startingWeight;
    float goalWeight;
    float height;
    boolean metric;
    ArrayList<Day> diaryEntries;

    public User(){}

    public User(float curWeight, float startingWeight, float goalWeight, float height,
                boolean metric, ArrayList<Day> diaryEntries) {
        this.curWeight = curWeight;
        this.startingWeight = startingWeight;
        this.goalWeight = goalWeight;
        this.height = height;
        this.metric = metric;
        this.diaryEntries = diaryEntries;
    }

    public float getCurWeight() {
        return curWeight;
    }

    public void setCurWeight(float curWeight) {
        this.curWeight = curWeight;
    }

    public float getStartingWeight() {
        return startingWeight;
    }

    public void setStartingWeight(float startingWeight) {
        this.startingWeight = startingWeight;
    }

    public float getGoalWeight() {
        return goalWeight;
    }

    public void setGoalWeight(float goalWeight) {
        this.goalWeight = goalWeight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isMetric() {
        return metric;
    }

    public void setMetric(boolean metric) {
        this.metric = metric;
    }

    public ArrayList<Day> getDiaryEntries() {
        return diaryEntries;
    }

    public void setDiaryEntries(ArrayList<Day> diaryEntries) {
        this.diaryEntries = diaryEntries;
    }

}
