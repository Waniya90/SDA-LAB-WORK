
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenting.a.cinema.ticket;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class PresentingACinemaTicket {

// Class representing a cinema ticket
class Ticket {
    private int ticketId;
    private String movieName;
    private String seatNumber;
    private double price;

    public Ticket(int ticketId, String movieName, String seatNumber, double price) {
        this.ticketId = ticketId;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId +
                ", Movie Name: " + movieName +
                ", Seat Number: " + seatNumber +
                ", Price: $" + price;
    }
}}
    