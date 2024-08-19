package com.fitnessapp.workouts;
import com.fitnessapp.users.User;

import java.time.Duration;
import java.util.List;

public class Yoga extends Workout{

    public Yoga(int workoutId, Duration duration, int caloriesBurned, List<User> users) {
        super(workoutId,"Yoga", duration, caloriesBurned,users);


    }

    @Override
    public void performWorkout() {
        System.out.println("Performing Yoga workout for " + getDuration() + " minutes.");
    }
}
