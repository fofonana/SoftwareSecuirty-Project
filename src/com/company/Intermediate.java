package com.company;

public class Intermediate {

    private final int rentCost = 70;
    private final int maxPass = 4;
    private int Days;
    private  double gas = 2.25;
    private double total_cost;
    private String confLevel = "medium";
    private String Cato = "Van/Minivan";
    private String car;



    public void getCost(int days, int apox_mailage) {

        total_cost  = (rentCost * days) + (gas * apox_mailage);


    }


    @Override
    public String toString() {
        return "Intermediate:" +
                "Rental Cost per "+ Days +" days =" + rentCost +
                ", Max Passengers =" + maxPass +
                ", Comfort Level :'" + confLevel + '\'' +
                ", Car Category :'" + Cato + '\'' +
                ", Total Cost = "+ total_cost +
                "  Car you choose :" + car +
                ' ';
    }
}
