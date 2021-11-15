package com.company.FRS;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ticket regularTicket = new RegularTicket("9681456", "Delhi",
                "Mumbai", "DepartureDateTime", "ArrivalDateTime",
                "5A", 4500, false, null, null, "snacks");

        Ticket touristTicket = new TouristTicket("456498", "India", "USA",
                "DepartureDateTime", "ArrivalDateTIme",
                "45A", 14500, false, null, null,
                "USA", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
    }

