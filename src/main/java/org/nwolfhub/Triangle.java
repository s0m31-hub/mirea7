package org.nwolfhub;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@Data
public class Triangle extends GeometricObject {
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public double getArea() {
        double half = getPerimeter() / 2;
        return Math.sqrt(half) * (half-side1) * (half-side2) * (half-side3);
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        List<Double> sorted = List.of(side1, side2, side3).stream().sorted().toList();
        if(sorted.get(0) + sorted.get(1) <= sorted.get(2)) {
            throw new IllegalTriangleException("I should be an IllegalArgumentException tbh");
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
