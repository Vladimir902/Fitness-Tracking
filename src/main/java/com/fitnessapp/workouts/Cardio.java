package com.fitnessapp.workouts;

import java.time.Duration;
import java.util.List;
import com.fitnessapp.users.User;


public class Cardio extends Workout {


    public Cardio(int workoutId, Duration duration, int caloriesBurned, List<User> users) {
        super(workoutId, "Cardio", duration, caloriesBurned,users);
    }

    @Override
    public void performWorkout() {
        System.out.println("Performing Cardio workout for " + getDuration() + " minutes.");
    }
}
