package org.example;

public class Main {
    public static void main(String[] args) {

        TrainStation trainStation = new TrainStation(10);
        int[] paths = trainStation.getAllFreePaths();
        for (int i = 0; i < paths.length; i++) {


            System.out.print(paths[i] + " | ");
        }
    }
}