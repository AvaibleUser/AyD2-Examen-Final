package org.example;

public class RectangleCalculator implements AreaCalculator {

    private double base;
    private double height;

    public RectangleCalculator(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

}
