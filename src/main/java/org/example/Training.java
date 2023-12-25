package org.example;

public abstract class Training {
    private double averageHeartRate;
    private int trainingDuration;
    private int athleteWeight;

    public Training(TrainingBuilder builder) {
        this.averageHeartRate = builder.averageHeartRate;
        this.trainingDuration = builder.trainingDuration;
        this.athleteWeight = builder.athleteWeight;
    }

    public abstract static class TrainingBuilder {
        private double averageHeartRate;
        private int trainingDuration;
        private int athleteWeight;

        public TrainingBuilder setAverageHeartRate(double averageHeartRate) {
            this.averageHeartRate = averageHeartRate;
            return this;
        }

        public TrainingBuilder setTrainingDuration(int trainingDuration) {
            this.trainingDuration = trainingDuration;
            return this;
        }

        public TrainingBuilder setAthleteWeight(int athleteWeight) {
            this.athleteWeight = athleteWeight;
            return this;
        }

        public abstract Training build();
    }

    public double getAverageHeartRate() {
        return averageHeartRate;
    }

    public int getTrainingDuration() {
        return trainingDuration;
    }

    public int getAthleteWeight() {
        return athleteWeight;
    }

    public double calculateCaloriesPerTraining() {
        return 0.014 * athleteWeight * trainingDuration * (0.12 * averageHeartRate - 7);
    }

    public abstract void printInfo();
}