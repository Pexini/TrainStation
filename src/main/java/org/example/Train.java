package org.example;

public class Train {
    private String number;
    private String startPoint;
    private String endPoint;

    public Train(String number, String startPoint, String endPoint) {
        this.number = number;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public String getNumber() {
        return number;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }
}
