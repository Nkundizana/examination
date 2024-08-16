/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class trainjourny1 {
   
    public static void main(String[] args) {
        int totalDistance = 10000;
        int distancePerPassengerStop = 150;
        int distancePerRefuelStop = 200;

        int passengerStops = totalDistance / distancePerPassengerStop;
        int refuelStops = totalDistance / distancePerRefuelStop;

        // We need to find the unique stops
        int totalStops = Math.max(passengerStops, refuelStops);

        System.out.println("The train will stop " + totalStops + " times between Kampala and Kabale.");
    }
}

    

