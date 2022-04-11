package paymoney.target;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare transaction array and size of transaction array
		int totalTransactions,totalTargets;
		Scanner scanner = new Scanner(System.in);

		//Create object of Paymoney DailyTarget Class
		Paymoney paymoney=new Paymoney();

		System.out.println("Enter the size of transaction array:");
		totalTransactions=scanner.nextInt();

		//Call insert value function to enter transactions
		System.out.println("Enter the values of array\n");
		paymoney.insertValues(totalTransactions);

		//Take user input for total number of targets to be achieved 
		System.out.println("Enter the no. of targets which need to be achieved:");
		totalTargets=scanner.nextInt();

		//determine if targets are achieved
		paymoney.dailyTarget(totalTargets);

		scanner.close();
	}
}
