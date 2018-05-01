package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {
	
	int price = itemPrice(); 
	int tendered = amountTendered();
	int diff = tendered - price;
	String output = changeOutput(diff);

	String changeOutput(int diff) {

		String output = "";

		while (diff > 0) {

			output += "Twenties: " + twenty(diff);
			diff = diff - twenty(diff) * 2000;

			output += "\nTens: " + ten(diff);
			diff = diff - ten(diff) * 1000;

			output += "\nFives: " + five(diff);
			diff = diff - five(diff) * 500;

			output += "\nDollars: " + dollar(diff);
			diff = diff - dollar(diff) * 100;

			output += "\nQuarters: " + quarter(diff);
			diff = diff - quarter(diff) * 25;

			output += "\nDimes: " + dime(diff);
			diff = diff - dime(diff) * 10;

			output += "\nNickels: " + nickel(diff);
			diff = diff - nickel(diff) * 5;

			output += "\nPennies: " + penny(diff);
			diff = diff - penny(diff) * 1;

			diff = 0;

		}
		return output;
	}
	
	int itemPrice() {
		System.out.print("Please enter the item price: ");
		Scanner input = new Scanner(System.in);
		int price = (int) (100 *(input.nextDouble()));
		return price;
	}

	int amountTendered() {
		System.out.print("Please enter the amount tendered: ");
		Scanner input = new Scanner(System.in);
		int tendered = (int)(100 *(input.nextDouble()));
		return tendered;
	}

	String priceDifference(int diff) {
		double difference = diff;
		String response;
		if (difference < 0) {
			response = "The cost of the item is higher than the " + "amount tendered.\n Please insert more money.";
			return response;
		} else if (difference == 0) {
			response = "Exact change! Thank you!";
			return response;
		} else {
			response = "Thank you. Processing payment and returning change.";
			return response;
		}
	}

	private int twenty(int diff) {
		double temp = diff % 2000;
		int twenty = (int) ((diff - temp) / 2000);
		diff = diff - (twenty * 2000);
		return twenty;
	}

	private int ten(int diff) {
		double temp = diff % 1000;
		int ten = (int) ((diff - temp) / 1000);
		diff = diff - (ten * 1000);
		return ten;
	}

	private int five(int diff) {
		double temp = diff % 500;
		int five = (int) ((diff - temp) / 500);
		diff = diff - (five * 500);
		return five;
	}

	private int dollar(int diff) {
		double temp = diff % 100;
		int dollar = (int) ((diff - temp) / 100);
		diff = diff - (dollar * 100);
		return dollar;
	}

	private int quarter(int diff) {
		double temp = diff % 25;
		int quarter = (int) ((diff - temp) / 25);
		diff = diff - (quarter * 25);
		return quarter;
	}

	private int dime(int diff) {
		double temp = diff % 10;
		int dime = (int) ((diff - temp) / 10);
		diff = diff - (dime * 10);
		return dime;
	}

	private int nickel(int diff) {
		double temp = diff % 5;
		int nickel = (int) ((diff - temp) / 5);
		diff = diff - (nickel * 5);
		return nickel;
	}

	private int penny(int diff) {
		double temp = diff % 1;
		int penny = (int) ((diff - temp) / 1);
		diff = diff - (penny * 1);
		return penny;

	}
}
