package com.fitnessapp.workouts;
import com.fitnessapp.users.User;

import java.time.Duration;
import java.util.List;


public abstract class Workout {
    private int workoutId;
    private String type;
    private Duration duration;
    private int caloriesBurned;
    protected List<User> users;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Workout(int workoutId, String type, Duration duration, int caloriesBurned,List<User> users) {
        this.workoutId = workoutId;
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.users = users;
    }

    public abstract void performWorkout();



}
