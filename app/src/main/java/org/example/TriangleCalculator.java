package org.example;

public class TriangleCalculator implements AreaCalculator {

    private double base;
    private double height;

    public TriangleCalculator(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

}
