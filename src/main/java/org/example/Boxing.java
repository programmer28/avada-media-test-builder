package org.example;

public class Boxing extends Training {

    public Boxing(BoxingBuilder builder) {
        super(builder);
    }

    public static class BoxingBuilder extends Training.TrainingBuilder {

        @Override
        public Training build() {
            return new Boxing(this);
        }
    }
    @Override
    public void printInfo() {
        System.out.println("Тренировка по кикбоксингу! Длительность: " + getTrainingDuration() + " минут. " +
                "Килокалорий: " + calculateCaloriesPerTraining());
    }
}