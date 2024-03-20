/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

public class Main {
    public static void main(String[]args){
        //Create an instance of Car
        Car car = new Car();
        
         // Set the values using the setter methods
    car.setCompany_name("Chevrolet");
    car.setModel_name("Cruze");
    car.setYear(2009);
    // mileage is not set using the setter method
    
        String company_name = car.getCompany_name();//variables locales
    String model_name = car.getModel_name();
    int year = car.getYear();
    double mileage = car.getMileage();

    // Print the values
    System.out.println("Company Name: " + company_name);
    System.out.println("Model Name: " + model_name);
    System.out.println("Year: " + year);
    System.out.println("Mileage: " + mileage);
    }
}
