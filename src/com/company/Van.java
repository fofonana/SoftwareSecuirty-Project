package com.company;

public class Van {


    private final int rentCost = 50;
    final int maxPass = 7 ;
    private int Days;
    final double gas = 2.25;
    private double total_cost;
    private final String confLevel = "medium";
    private final String Cato ="Sedan, Hybrid";
    private final String car = "019 Kia Sedona LX";



    public void setDays(int days) {
        Days = days;
    }

    public void getCost(int days ,int apox_mailage){

        total_cost  = (rentCost * days) + (gas * apox_mailage);


    }

    @Override
    public String toString() {
        return "Van: \n" +
                "Rental Cost per "+ Days +" days = " + rentCost +
                ", Max Passengers = " + maxPass +
                ", Comfort Level :'" + confLevel + '\'' +
                ", Car Category :'" + Cato + '\'' +
                ", Total Cost = "+ total_cost +
                "  Car you choose :" + car +
                ' ';
    }
}
