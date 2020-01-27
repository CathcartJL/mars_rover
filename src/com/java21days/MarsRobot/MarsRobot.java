package com.java21days.MarsRobot;

public class MarsRobot {
    public String status;
    public int speed;
    public float temperature;

    public void checkTemperature() {
        if (temperature < -80){
        status = "returning home";
        speed = 5;
            }
        }
    public void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
}
