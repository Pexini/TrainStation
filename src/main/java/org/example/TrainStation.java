package org.example;

public class TrainStation {
    Train[] trains;

    public TrainStation(int size) {
        this.trains = new Train[size];
    }

    public int[] getAllFreePaths() {
        int[] paths = new int[getFreePathsCount()];
        int counter = 0;
        for (int i = 0; i < trains.length; i++) {
            if (trains[i] == null) {
                paths[counter] = i;
                counter++;
            }
        }
        return paths;
    }

    private int getFreePathsCount() {
        int count = 0;
        for (int i = 0; i < trains.length; i++) {
            if (trains[i] == null) {
                count++;
            }
        }
        return count;
    }
}