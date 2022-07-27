package my.first.java.project;

import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("## Welcome to the Banking System ##");
		System.out.println("-----------------------------------");
		System.out.println(
				"Choose one option to continue\n 1. Enter your account number to begin\n 2. Create new account\n 0. Exit");

		int clientInicialInput = (Integer.parseInt(sc.nextLine()));

		// account variables
		int clientAccountNumber = 0;
		String clientFullName = null;
		int clientRegisterNumber = 0;
		double clientAvailableBalance = 0.00;

		switch (clientInicialInput) {
		case 1:
			System.out.println("Type your account number.\n");
			clientAccountNumber = (Integer.parseInt(sc.nextLine()));
			break;

		case 2:
			System.out.println("Type your full name.");
			clientFullName = sc.nextLine();
			System.out.println("Type your register number");
			clientRegisterNumber = (Integer.parseInt(sc.nextLine()));
			clientAccountNumber = (int) (Math.random() * 10 + 1);
			break;

		case 0:
			System.out.println("Thank you. Goodbye!");
			System.exit(0);

		default:
			System.out.println("Choose an appropriate number next time");
			System.out.println("\nThank you. Goodbye!");
			System.exit(0);
		}

		int chosenNumberFromMainMenu = 9;

		if (clientInicialInput == 1) {
			System.out.println("## Main Menu ##");
			System.out.println("-----------------------------------");
			System.out.println(
					"Choose one option to continue\n 1. View my available balance\n 2. Cash withdrawal \n 3. Deposit funds\n 0. Exit");
			chosenNumberFromMainMenu = (Integer.parseInt(sc.nextLine()));
		} else {
			if (clientInicialInput == 2) {
				System.out.println("## New account created successfully ##");
				System.out.println("Your full name is: " + clientFullName);
				System.out.println("Your register number is: " + clientRegisterNumber);
				System.out.println("Your account number is: " + clientAccountNumber);
				System.out.println("Your available balance is: " + clientAvailableBalance);
				System.out.println("Thank you. Goodbye!");
				System.exit(0);
			}
		}

		double depositAmount;
		double withdrawalAmount;

		if (chosenNumberFromMainMenu == 1) {
			System.out.println("Available balance is: " + clientAvailableBalance);
			System.out.println("\nThank you. Goodbye!");
		} else {
			if (chosenNumberFromMainMenu == 2) {
				System.out.println("Type the withdrawal amount ");
				withdrawalAmount = (Double.parseDouble(sc.nextLine()));
				if (withdrawalAmount <= clientAvailableBalance) {
					clientAvailableBalance -= withdrawalAmount;
					System.out.println("Cash withdrawal. Available balance is: " + clientAvailableBalance);
				} else {
					System.out.println("Available balance is: " + clientAvailableBalance);
					System.out.println("\nThank you. Goodbye!");
				}
			} else {
				if (chosenNumberFromMainMenu == 3) {
					System.out.println("Type the deposit amount ");
					depositAmount = (Double.parseDouble(sc.nextLine()));
					clientAvailableBalance += depositAmount;
					System.out.println("Done. Your available balance is: " + clientAvailableBalance);
					System.out.println("\nThank you. Goodbye!");
				} else {
					if (chosenNumberFromMainMenu == 0) {
						System.out.println("Thank you. Goodbye!");
					} else {
						System.out.println("Choose an appropriate number next time");
						System.out.println("\nThank you. Goodbye!");
					}
				}
			}
		}

		sc.close();
	}
}
