package com.example;

public class Goal {
    private String description;
    private boolean achieved;

    public Goal(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Goal description cannot be empty.");
        }
        this.description = description;
        this.achieved = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAchieved() {
        return achieved;
    }

    public void achieve() {
        this.achieved = true;
    }

    @Override
    public String toString() {
        return "Goal: " + description + ", Achieved: " + achieved;
    }
}
