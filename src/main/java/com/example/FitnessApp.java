package com.example;

import java.util.ArrayList;
import java.util.List;

public class FitnessApp {
    private List<Workout> workouts;
    private List<Goal> goals;

    public FitnessApp() {
        this.workouts = new ArrayList<>();
        this.goals = new ArrayList<>();
    }

    public void logWorkout(Workout workout) {
        workouts.add(workout);
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public int getTotalCaloriesBurned() {
        int totalCalories = 0;
        for (Workout workout : workouts) {
            totalCalories += workout.getCaloriesBurned();
        }
        return totalCalories;
    }

    public void setGoal(Goal goal) {
        goals.add(goal);
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public static void main(String[] args) {

    }
}
