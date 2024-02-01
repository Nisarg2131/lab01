package com.example.lab01;

public class Car {

    private String companyName;
    private String carName;
    private String model;
    private int price;

    public Car(String companyName, String carName, String model, int price) {
        this.companyName = companyName;
        this.carName = carName;
        this.model = model;
        this.price = price;
    }

    public String getinfo(){
        return "Company name: " + companyName + " Car Name: " + carName + " Model is: " + model + " Price is: " + price;
    }

}
