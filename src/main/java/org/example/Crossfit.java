package org.example;

public class Crossfit extends Training {
    private double projectileWeight;

    public Crossfit(CrosfitBuilder builder) {
        super(builder);
        this.projectileWeight = builder.projectileWeight;
    }

    public static class CrosfitBuilder extends Training.TrainingBuilder {
        private double projectileWeight;

        public CrosfitBuilder setProjectileWeight(double projectileWeight) {
            this.projectileWeight = projectileWeight;
            return this;
        }

        @Override
        public Training build() {
            return new Crossfit(this);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Кросфит тренировка! Длительность: " + getTrainingDuration() + " минут. " +
                "Средний вес штанги: " + projectileWeight + " кг. Килокалорий: " + calculateCaloriesPerTraining());
    }
}