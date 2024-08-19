package com.fitnessapp.nutrition;

import com.fitnessapp.users.User;

import java.util.List;

public interface INutritionPlan {

    String getDietType();
    int getCalories();
    void followPlan();
    List<User> getUsers();

}

