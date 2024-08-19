package com.fitnessapp.workouts;

import java.time.Duration;
import java.util.List;

import com.fitnessapp.users.User;


public class StrengthTraining extends Workout {

    public StrengthTraining(int workoutId, Duration duration, int caloriesBurned, List<User> users) {
        super(workoutId, "Strength Training", duration, caloriesBurned, users);
    }

    @Override
    public void performWorkout() {
        System.out.println("Performing Strength training workout for " + getDuration() + " minutes.");

        for (User user : users) {
            System.out.println("Users are" + " " + user.getUserId() + " " + user.getUsername() + " " + user.getEmail());

        }
    }
}
