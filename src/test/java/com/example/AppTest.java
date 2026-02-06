package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

public class AppTest {
    private FitnessApp app;

    @BeforeEach
    public void setUp() {
        app = new FitnessApp();
    }

    @Test
    public void testLogWorkout() {
        Workout workout = new Workout("Running", 30, 300);
        app.logWorkout(workout);
        assertEquals(1, app.getWorkouts().size());
        assertEquals("Running", app.getWorkouts().get(0).getName());
    }

    @Test
    public void testTrackProgress() {
        app.logWorkout(new Workout("Running", 30, 300));
        app.logWorkout(new Workout("Weightlifting", 60, 400));
        assertEquals(700, app.getTotalCaloriesBurned());
    }

    @Test
    public void testSetGoal() {
        Goal goal = new Goal("Run a 5k");
        app.setGoal(goal);
        assertEquals(1, app.getGoals().size());
        assertEquals("Run a 5k", app.getGoals().get(0).getDescription());
    }

    @Test
    public void testAchieveGoal() {
        Goal goal = new Goal("Run a 5k");
        app.setGoal(goal);
        goal.achieve();
        assertTrue(app.getGoals().get(0).isAchieved());
    }
}
