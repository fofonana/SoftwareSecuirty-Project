package com.company;

public class Standard {

    private int rentCost= 55;
    private int maxPass= 5;
    private int Days;
    private double gas = 2.25;
    private double total_cost;
    private String confLevel = "good";
    private String Cato = "Truck, Crossover, SUV";
    private String car ;



    public void setDays(int days) {
        Days = days;
    }

    public void getCost(int days ,int apox_mailage){

        total_cost  = (rentCost * days) + (gas * apox_mailage);


    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Standard: \n" +
                "Rental Cost per "+ Days +" days = " + rentCost +
                ", Max Passengers = " + maxPass +
                ", Comfort Level :'" + confLevel + '\'' +
                ", Car Category :'" + Cato + '\'' +
                ", Total Cost = "+ total_cost +
                "  Car you choose :" + car +
                ' ';
    }
}
