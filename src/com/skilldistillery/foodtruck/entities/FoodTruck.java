package com.skilldistillery.foodtruck.entities;



public class FoodTruck {
   private String id;
   private String name;
   private String foodType;
   private double rating;

   private static int MAX_NUMBER_OF_TRUCKS = 5;


   public FoodTruck() {

   }

   public FoodTruck(String name, String foodType, double rating) {
      this.name = name;
      this.foodType = foodType;
      this.rating = rating;
   }

   public FoodTruck(String id, String name, String foodType, double rating) {
      this.id = id;
      this.name = name;
      this.foodType = foodType;
      this.rating = rating;
   }


   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getFoodType() {
      return foodType;
   }

   public void setFoodType(String foodType) {
      this.foodType = foodType;
   }

   public double getRating() {
      return rating;
   }

   public void setRating(double rating) {
      this.rating = rating;
   }

   public static int getMaxNumberOfTrucks() {
      return MAX_NUMBER_OF_TRUCKS;
   }

   public static void setMaxNumberOfTrucks(int maxNumberOfTrucks) {
      MAX_NUMBER_OF_TRUCKS = maxNumberOfTrucks;
   }

   @Override
   public String toString() {
      return "FoodTruck{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", foodType='" + foodType + '\'' +
            ", rating=" + rating +
            '}';
   }


   public void mainMenu() {
      String welcomeMessage = "--------     Welcome to the Food Truck Review App  -----------";
      System.out.println();
      System.out.println(welcomeMessage.toUpperCase());
      System.out.println("--------------------------------------------------------------");
      System.out.println("-------------   1-) Add a food truck -------------------------");
      System.out.println("-------------   2-) Show all food trucks ---------------------");
      System.out.println("-------------   3-) Show average ratings for all trucks ------");
      System.out.println("-------------   4-) Show the truck with the highest rating ---");
      System.out.println("-------------   5-) Show the truck with the lowest rating ----");
      System.out.println("-------------   6-) Quit -------------------------------------");
      System.out.println("--------------------------------------------------------------");
   }


}