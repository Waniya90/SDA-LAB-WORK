/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenting.a.cinema.ticket;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class CinemaTicketManagmentSystem {

  // Main class to run the system

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketManager ticketManager = new TicketManager();

        while (true) {
            System.out.println("\n--- Cinema Ticket Management System ---");
            System.out.println("1. Create Ticket");
            System.out.println("2. Display All Tickets");
            System.out.println("3. Update Ticket");
            System.out.println("4. Delete Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter movie name: ");
                    String movieName = scanner.nextLine();
                    System.out.print("Enter seat number: ");
                    String seatNumber = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    ticketManager.createTicket(movieName, seatNumber, price);
                    break;

                case 2:
                    ticketManager.displayTickets();
                    break;

                case 3:
                    System.out.print("Enter ticket ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left-over
                    System.out.print("Enter new movie name: ");
                    String newMovieName = scanner.nextLine();
                    System.out.print("Enter new seat number: ");
                    String newSeatNumber = scanner.nextLine();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    ticketManager.updateTicket(updateId, newMovieName, newSeatNumber, newPrice);
                    break;

                case 4:
                    System.out.print("Enter ticket ID to delete: ");
                    int deleteId = scanner.nextInt();
                    ticketManager.deleteTicket(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}


