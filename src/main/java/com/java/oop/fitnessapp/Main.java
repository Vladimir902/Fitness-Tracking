package com.java.oop.fitnessapp;

import com.fitnessapp.nutrition.Bulking;
import com.fitnessapp.nutrition.Cutting;
import com.fitnessapp.users.User;
import com.fitnessapp.workouts.Cardio;
import com.fitnessapp.workouts.StrengthTraining;
import com.fitnessapp.workouts.Yoga;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //creating user objects
        User user1 = new User(1, "Vladimir", "vladicabt@hotmail.com");
        User user2 = new User(2, "Eric", "eric22@gmail.com");

        //adding users in arraylist
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        //abstract classes
        Cardio c1 = new Cardio(1,Duration.ofMinutes(120), 1000,users);
        c1.performWorkout();

        //empty line for readability
        System.out.println();

        //creating objects for inherited classes
        StrengthTraining s1 = new StrengthTraining(2,Duration.ofMinutes(60),500,users);
        s1.performWorkout();
        Yoga y1 = new Yoga(3,Duration.ofMinutes(100),100,users);
        y1.performWorkout();

        //empty line for readability
        System.out.println();


        //interfaces
        Bulking b1 = new Bulking();
        b1.followPlan();
        Cutting cutting = new Cutting();
        cutting.followPlan();

        //Creating users with a nutrition plan with interfaces
        User user3 = new User(3,"Petko", "petko_petkovski@outlook.com");
        Bulking bulk = new Bulking();
        bulk.addUser(user3);
        bulk.followPlan();

        //Adding users for cutting nutrition plan
        User user4 = new User(4,"Josh", "josh11@live.com");
        Cutting cut = new Cutting();
        User user5 = new User(5,"Eric", "eric007@aol.com");
        cut.addUser(user4);
        cut.addUser(user5);
        cut.theUsers();



    }
}