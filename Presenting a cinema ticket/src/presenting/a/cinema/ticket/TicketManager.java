/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenting.a.cinema.ticket;

import java.util.ArrayList;
import presenting.a.cinema.ticket.PresentingACinemaTicket.Ticket;

/**
 *
 * @author Hp
 */
class TicketManager {

    private ArrayList<Ticket> tickets = new ArrayList<>();
    private int nextTicketId = 1;

    // Create a new ticket
    public void createTicket(String movieName, String seatNumber, double price) {
        Ticket newTicket = null;
        
        tickets.add(newTicket);
        System.out.println("Ticket created: " + newTicket);
    }


    // Read (display) all tickets
    public void displayTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets available.");
        } else {
            tickets.forEach((ticket) -> {
                System.out.println(ticket);
            });
        }
    }

    // Update a ticket
    public void updateTicket(int ticketId, String newMovieName, String newSeatNumber, double newPrice) {
        Ticket ticket = findTicketById(ticketId);
        if (ticket != null) {
            ticket.setMovieName(newMovieName);
            ticket.setSeatNumber(newSeatNumber);
            ticket.setPrice(newPrice);
            System.out.println("Ticket updated: " + ticket);
        } else {
            System.out.println("Ticket not found.");
        }
    }

    // Delete a ticket
    public void deleteTicket(int ticketId) {
        Ticket ticket = findTicketById(ticketId);
        if (ticket != null) {
            tickets.remove(ticket);
            System.out.println("Ticket deleted: " + ticket);
        } else {
            System.out.println("Ticket not found.");
        }
    }

    // Find a ticket by its ID
    private Ticket findTicketById(int ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getTicketId() == ticketId) {
                return ticket;
            }
        }
        return null;
    }
}

    