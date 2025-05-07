package org.example;

public class CircleAreaCalculator implements AreaCalculator {

    private double radius;

    public CircleAreaCalculator(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
