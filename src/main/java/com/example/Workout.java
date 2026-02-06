package com.example;

public class Workout {
    private String name;
    private int duration; // in minutes
    private int caloriesBurned;

    public Workout(String name, int duration, int caloriesBurned) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Workout name cannot be empty.");
        }
        if (duration <= 0) {
            throw new IllegalArgumentException("Workout duration must be positive.");
        }
        if (caloriesBurned < 0) {
            throw new IllegalArgumentException("Calories burned cannot be negative.");
        }
        this.name = name;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public String toString() {
        return "Workout: " + name + ", Duration: " + duration + " minutes, Calories Burned: " + caloriesBurned;
    }
}
