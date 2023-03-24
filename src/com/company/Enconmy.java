package com.company;

public class Enconmy {

    private final int rentCost = 45;
    private final int maxPass = 4;
    private int Days;
    private double gas = 2.25;
    private double total_cost;
    private final String confLevel = "poor";
    private final  String Cato ="Coupe";
    private final String car = "2007 Saturn ION Level 2";




    public void getCost(int days ,int apox_mailage){

        total_cost  = (rentCost * days) + (gas * apox_mailage);


    }

    public void setDays(int days) {
        Days = days;
    }

    public String getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Enconmy : \n" +
                "Rental Cost per "+ Days +" days = " + rentCost +
                ", Max Passengers = " + maxPass +
                ", Comfort Level :'" + confLevel + '\'' +
                ", Car Category :'" + Cato + '\'' +
                ", Total Cost = "+ total_cost +
                "  Car you choose :" + car +
                ' ';
    }
}
