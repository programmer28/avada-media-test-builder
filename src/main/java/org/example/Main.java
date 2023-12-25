package org.example;


public class Main {
    public static void main( String[] args ) {
        Running running1 = (Running)new Running.RunningBuilder()
                        .setDistance(10).setAthleteWeight(75).setAverageHeartRate(100).setTrainingDuration(60)
                        .build();
        Running running2 = (Running)new Running.RunningBuilder()
                        .setDistance(5).setAthleteWeight(60).setAverageHeartRate(95).setTrainingDuration(20)
                        .build();
        Crossfit crosfit = (Crossfit)new Crossfit.CrosfitBuilder()
                        .setProjectileWeight(90).setAthleteWeight(85).setAverageHeartRate(110).setTrainingDuration(50)
                        .build();
        Boxing boxing = (Boxing)new Boxing.BoxingBuilder()
                        .setAthleteWeight(78).setAverageHeartRate(97).setTrainingDuration(120)
                        .build();

        Training[] trainingsPerWeek = {running1, running2, crosfit, boxing};

        for (Training training : trainingsPerWeek) {
            training.printInfo();
        }
    }
}
