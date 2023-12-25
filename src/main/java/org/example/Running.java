package org.example;

public class Running extends Training {
    private double distance;

    public Running(RunningBuilder builder) {
        super(builder);
        this.distance = builder.distance;
    }

    public static class RunningBuilder extends Training.TrainingBuilder {
        private double distance;

        public RunningBuilder setDistance(double distance) {
            this.distance = distance;
            return this;
        }

        @Override
        public Training build() {
            return new Running(this);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Беговая тренировка! Длительность: " + getTrainingDuration() + " минут. " +
                "Дистанция: " + distance + " км. Килокалорий: " + calculateCaloriesPerTraining());
    }
}