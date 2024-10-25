/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seats;

/**
 *
 * @author Hp
 */

public class XYZAirline {
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Seats {

    // Abstract class Seat
abstract class Seat {
    public abstract int Calculate_Seat_Price(int nofseats);
}

// Business Class extending Seat
class BusinessClass extends Seat {
    @Override
    public int Calculate_Seat_Price(int nofseats) {
        return nofseats * 2000; // Assuming each Business Class seat costs 2000 units
    }
}

// First Class extending Seat
class FirstClass extends Seat {
    @Override
    public int Calculate_Seat_Price(int nofseats) {
        return nofseats * 3000; // Assuming each First Class seat costs 3000 units
    }
}

// Economy Class extending Seat
class EconomyClass extends Seat {
    @Override
    public int Calculate_Seat_Price(int nofseats) {
        return nofseats * 1000; // Assuming each Economy Class seat costs 1000 units
    }
}
    
}
