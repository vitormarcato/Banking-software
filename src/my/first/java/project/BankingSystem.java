package my.first.java.project;
import java.util.Scanner;


public class BankingSystem {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("## Welcome to the Banking System ##");
		
		System.out.println("Type the number you wish \n 1. Enter your account number \n 2. Create new account \n 0. Exit");
		
		int clientInput  = (Integer.parseInt(sc.nextLine()));
		
		switch (clientInput) {
			case 1: System.out.println("opçao um");
					break;
			case 2: System.out.println("opçao dois");
				break;
			case 0: System.out.println("opção zero");
				break;
			default: System.out.println("valor inválido");
				break;
		}
		
		sc.close();
	}
}
