package com.fitnessapp.nutrition;

import com.fitnessapp.users.User;

import java.util.ArrayList;
import java.util.List;

public class Cutting implements INutritionPlan  {

    private String dietType;
    private int calories;
    private List<User> users;
    private String username;

    public Cutting() {
        this.users = new ArrayList<>();
    }


    @Override
    public String getDietType() {
        return "Mesomorph";
    }

    @Override
    public int getCalories() {
        return calories;
    }

    public List<User> getUsers() {
        return users;
    }


    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public void followPlan() {
        System.out.println("Diet plan for : " + getDietType() + "Chicken,salad,fruit,vegetables" + "calories" + " " + getCalories());

    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void theUsers() {
        for (User user : users) {
            System.out.println("The users of cutting nutrition plan are : " + " " + user.getUsername());
        }
    }
}
