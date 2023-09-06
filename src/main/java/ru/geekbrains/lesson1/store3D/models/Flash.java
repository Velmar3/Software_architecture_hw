package ru.geekbrains.lesson1.store3D.models;

import java.awt.*;
import java.util.List;

public class Flash {

    //TODO: Доработать в рамках ДР
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private Float power;

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    public void Rotate(Angle3D angle){
        this.angle=angle;
    }

    public void Move(Point3D location){
        this.location=location;
    }

}
