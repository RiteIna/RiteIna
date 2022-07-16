package com.train.booking;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainMain {
	public static void main(String[] args) {

		
		System.out.println("Now searching for trains..");
		TrainService.searchTrainsBetweenStations("Hyderabad", "Goa", LocalDate.now(), 10);
		TrainService.searchTrainsBetweenStations("Mumbai", "New Delhi", LocalDate.now(), 5);
		BankAccount b1 = new BankAccount();
		b1.setActNumber(999);
		b1.setActBalance(10000);
		
		
		Passenger p1 = new Passenger(10, "Ritesh Jaiswal", 19, b1);
		Passenger p2 = new Passenger(20, "Anmol Rastogi", 21, b1);
		Passenger p3 = new Passenger(10, "Piyush Sinha", 22, b1);
		
		List<Passenger> passengerList = new LinkedList<>();
		
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		
		System.out.println("Now booking tickets for 3 passengers in train number 101...");
		
		
		TrainService.bookTickets(104, passengerList);
		TrainService.bookTickets(101, passengerList);
		
		System.out.println("Now printing the ticket details....");
		
		TicketService.showTicketDetails(1);
		TicketService.showTicketDetails(2);
	}

}
