/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenting.a.cinema.ticket;

import presenting.a.cinema.ticket.PresentingACinemaTicket.Ticket;

/**
 *
 * @author Hp
 */
class tickets {

    static void remove(PresentingACinemaTicket.Ticket ticket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     // Find a ticket by its ID
    private Ticket findTicketById(int ticketId) {
        Iterable<Ticket> tickets = null;
        for (Ticket ticket : tickets) {
            if (ticket.getTicketId() == ticketId) {
                return ticket;
            }
        }
        return null;
    }
}


