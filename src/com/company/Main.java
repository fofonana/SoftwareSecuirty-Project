package com.company;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
public class Main {

    public static void main(String[] args) {
        System.out.println("\n" +
                "───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────\n" +
                "─████████████████───██████████████─██████──────────██████─██████████████─██████████████─██████────────────██████████████─██████████████─████████████████───\n" +
                "─██░░░░░░░░░░░░██───██░░░░░░░░░░██─██░░██████████──██░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██────────────██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░██───\n" +
                "─██░░████████░░██───██░░██████████─██░░░░░░░░░░██──██░░██─██████░░██████─██░░██████░░██─██░░██────────────██░░██████████─██░░██████░░██─██░░████████░░██───\n" +
                "─██░░██────██░░██───██░░██─────────██░░██████░░██──██░░██─────██░░██─────██░░██──██░░██─██░░██────────────██░░██─────────██░░██──██░░██─██░░██────██░░██───\n" +
                "─██░░████████░░██───██░░██████████─██░░██──██░░██──██░░██─────██░░██─────██░░██████░░██─██░░██────────────██░░██─────────██░░██████░░██─██░░████████░░██───\n" +
                "─██░░░░░░░░░░░░██───██░░░░░░░░░░██─██░░██──██░░██──██░░██─────██░░██─────██░░░░░░░░░░██─██░░██────────────██░░██─────────██░░░░░░░░░░██─██░░░░░░░░░░░░██───\n" +
                "─██░░██████░░████───██░░██████████─██░░██──██░░██──██░░██─────██░░██─────██░░██████░░██─██░░██────────────██░░██─────────██░░██████░░██─██░░██████░░████───\n" +
                "─██░░██──██░░██─────██░░██─────────██░░██──██░░██████░░██─────██░░██─────██░░██──██░░██─██░░██────────────██░░██─────────██░░██──██░░██─██░░██──██░░██─────\n" +
                "─██░░██──██░░██████─██░░██████████─██░░██──██░░░░░░░░░░██─────██░░██─────██░░██──██░░██─██░░██████████────██░░██████████─██░░██──██░░██─██░░██──██░░██████─\n" +
                "─██░░██──██░░░░░░██─██░░░░░░░░░░██─██░░██──██████████░░██─────██░░██─────██░░██──██░░██─██░░░░░░░░░░██────██░░░░░░░░░░██─██░░██──██░░██─██░░██──██░░░░░░██─\n" +
                "─██████──██████████─██████████████─██████──────────██████─────██████─────██████──██████─██████████████────██████████████─██████──██████─██████──██████████─\n" +
                "───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        //Variables
        int NumPass;
        int renDay;
        int mailTrip;
        Enconmy car_Enco = new Enconmy();
        Van van = new Van();
        //Intermediate car_Inter = new Intermediate();
        Standard car_Stan = new Standard();
        try {
            File CarFile = new File("Suggestion-Car.txt");
            if (CarFile.createNewFile()) {
               System.out.println("File created: " + CarFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //-------------
        Scanner scan = new Scanner(System.in);
        System.out.println("Wlcome Dear User !");
        //Valdate the inputs
        System.out.print("Enter number of passenger :");
        NumPass = scan.nextInt();
        do {
            if(NumPass > 7 || NumPass <= 0 ){

                System.out.println("We Can not Accept more than 7 passengers or 0 and less ,Please try again  ");
                System.out.print("Enter number of passenger :");
                NumPass = scan.nextInt();
            }

        }while (NumPass > 7  || NumPass <= 0);
        //----------------------------
        System.out.print("Enter number of days to rent a car:");
        renDay = scan.nextInt();
        do {
            if(renDay > 15  || renDay <= 0){

                System.out.println("We Can not Accept more than 15 rent day or 0 and less ,Please try again ");
                System.out.print("Enter number of days to rent a car:");
                renDay = scan.nextInt();
            }

        }while (renDay > 15  || renDay <= 0);
        //----------------------------
        System.out.print("Enter Approx mileage for the trip:");
        mailTrip = scan.nextInt();
        do {
            if (mailTrip <= 0){
                System.out.println("Wrong input 0 and less unaccepted  try again ");
                System.out.print("Enter Approx mileage for the trip:");
                mailTrip = scan.nextInt();
            }
        }while (mailTrip <= 0);
        //----------------------------
        if (NumPass <= 4){

            System.out.println("based on your choice, this the cheapest car we suggest you to pick");
             car_Enco.getCost(renDay,mailTrip);
            car_Enco.setDays(renDay);
            EconomyMethod();
            System.out.println(car_Enco.toString());
            //write to file
            try {
                FileWriter myWriter = new FileWriter("Suggestion-Car.txt");
                myWriter.write(car_Enco.toString());
                myWriter.close();
                System.out.println("Successfully wrote to the file."+ "\n Please check file ");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        else if (NumPass <= 5 ){
            System.out.println("based on your choice, this the cheapest car we suggest you to pick");
            car_Stan.getCost(renDay,mailTrip);
            car_Stan.setDays(renDay);
            StandMethod(car_Stan);
            System.out.println(car_Stan.toString());
            //write to file
            try {
                FileWriter myWriter = new FileWriter("Suggestion-Car.txt");
                myWriter.write(car_Stan.toString());
                myWriter.close();
                System.out.println("Successfully wrote to the file."+ "\n Please check file ");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }

         if (NumPass == 7 || NumPass == 6) {
            System.out.println("based on your choice, this the cheapest car we suggest you to pick");
            van.getCost(renDay,mailTrip);
            van.setDays(renDay);
            VanMethod();
            System.out.println( van.toString());
            //write to file
            try {
                FileWriter myWriter = new FileWriter("Suggestion-Car.txt");
                myWriter.write(van.toString());
                myWriter.close();
                System.out.println("Successfully wrote to the file."+ "\n Please check file ");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }
        else {

            System.out.println("Sorry we can not offer that number of passengers !");
            System.exit(0);
        }

    }

    protected   static void EconomyMethod(){
        System.out.println("coupe , 2007 Saturn ION Level 2");


    }

    protected static void StandMethod(Standard car){
        int choise ;
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Please pick your car :");
        System.out.println("1 ) Truck: 2017 Chevrolet Silverado 1500 LT ");
        System.out.println("2 ) SUV: 2022 Ford F150 XLT ");
        System.out.println("3 ) Crossover: 2022 Jeep Compass Limited");
        choise = input.nextInt();
        while(loop){
            switch (choise){
                case 1:
                    car.setCar("Truck: 2017 Chevrolet Silverado 1500 LT");
                    loop = false;
                    break;
                case 2:
                    car.setCar("SUV: 2022 Ford F150 XLT");
                    loop = false;
                    break;
                case 3:
                    car.setCar("Crossover: 2022 Jeep Compass Limited");
                    loop = false;
                    break;
                default:
                    System.out.println("Sorry wrong choice , try again");
                    loop = true;
            }
        }

    }
    protected static void VanMethod(){

       System.out.println("Van , 019 Kia Sedona LX");


   }

}
