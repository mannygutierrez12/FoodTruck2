package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //Created an array with the max number of truck possible
        FoodTruck[] foodTrucks = new FoodTruck[FoodTruck.getMaxNumberOfTrucks()];

        //Created a reference called program Components that can get access the
        // menu and other features from the FoodTruck class.
        FoodTruck programComponents = new FoodTruck();

        boolean stillRunning = true;
        int count = 0;

        while (stillRunning) {
            programComponents.mainMenu();
            System.out.println("Please choose a number from the menu above: ");
            String userInput = kb.next();

           if (userInput.equals("1")) {
                if (count == 5) {
                    System.out.println("Sorry, but the app reached its limit");
                    continue;
                } else {
                    String truckName;
                    System.out.print("Please enter the name of the truck. (NO SPACES!)");
                    System.out.println();
                    truckName = kb.next();
                    System.out.println();

                    String foodType;
                    System.out.print("What type of food do they serve? (NO SPACES) ");
                    foodType = kb.next();
                    System.out.println();

                    double truckRating;
                    System.out.println("From 1 to 5. How would you rate them?: ");
                    truckRating = kb.nextDouble();


                    String newTruckId = "XYSZ0" + (count+1);

                    FoodTruck newTruck = new FoodTruck(newTruckId, truckName, foodType, truckRating);
                    foodTrucks[count++] = newTruck;

                    System.out.println("Your truck was successfully added to our list");
                }
            } else if (userInput.equals("2")) {
                if (count == 0) {
                    System.out.println("Our apologies. No truck has been added. Please come back later.");
                    continue;
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println(foodTrucks[i]);
                    }
                }
            } else if (userInput.equals("3")) {
                if (count == 0) {
                    System.out.println("Sorry, but we do not have enough data at this moment");
                } else {
                    double totalSum = 0;
                    double averageTrucksRating;
                    for (int i = 0; i < count; i++) {
                        totalSum += foodTrucks[i].getRating();
                    }
                    averageTrucksRating = totalSum / count;
                    System.out.println("The average up until now is: " + averageTrucksRating);
                }
            } else if (userInput.equals("4")) {
                if (count == 0) {
                    System.out.println("Sorry but we have no data yet");
                } else {
                    FoodTruck newCount = foodTrucks[0];
                    for (int i = 0; i < count; i++) {
                        if (foodTrucks[i].getRating() > newCount.getRating()) {
                            newCount = foodTrucks[i];
                        }
                    }
                    System.out.println("The food truck with the highest rating is: " + newCount);
                }
            } else if (userInput.equals("5")) {
                if (count == 0) {
                    System.out.println("Sorry but we have no data yet");
                } else {
                    FoodTruck newCount = foodTrucks[0];
                    for (int i = 0; i < count; i++) {
                        if (foodTrucks[i].getRating() < newCount.getRating()) {
                            newCount = foodTrucks[i];
                        }
                    }
                    System.out.println("The food truck with the lowest rating is: " + newCount);
                }
            }else if (userInput.equals("6")) {
                stillRunning = false;
                System.out.println("See you next time!");
            } else {
                System.out.println("That is not a valid option. Please try again");
                continue;
            }
        }
    }


}
