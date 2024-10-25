/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyzairlines;

/**
 *
 * @author Hp
 */
{

   // Main class to test the implementation
public class XYZAIRLINES {
    public static void main(String[] args) {
        Seat business = new BusinessClass();
        Seat first = new FirstClass();
        Seat economy = new EconomyClass();

        int businessSeats = 5;
        int firstSeats = 3;
        int economySeats = 10;

        System.out.println("Business Class total price: " + business.Calculate_Seat_Price(businessSeats));
        System.out.println("First Class total price: " + first.Calculate_Seat_Price(firstSeats));
        System.out.println("Economy Class total price: " + economy.Calculate_Seat_Price(economySeats));
    }
}
}
