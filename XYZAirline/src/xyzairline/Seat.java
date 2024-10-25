/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyzairline;

/**
 *
 * @author Hp
 */
public abstract class Seat {

    public abstract int Calculate_Seat_Price(int nofseats);
}


class BusinessClass extends Seat {
    @Override
    public int Calculate_Seat_Price(int nofseats) {
        return nofseats * 2000; 
    }
}


class FirstClass extends Seat {
    @Override
    public int Calculate_Seat_Price(int nofseats) {
        return nofseats * 3000; 
    }
}


class EconomyClass extends Seat {
    @Override
    public int Calculate_Seat_Price(int nofseats) {
        return nofseats * 1000; 
    }
}
