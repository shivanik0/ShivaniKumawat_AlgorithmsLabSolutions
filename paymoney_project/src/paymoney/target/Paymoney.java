package paymoney.target;

import java.util.Scanner;

public class Paymoney {
	private int arr[],targetValue,sumOfTransactions;
	Scanner scanner = new Scanner(System.in);

	public void insertValues(int totalTransactions) {	
		arr = new int[totalTransactions];

		for (int i=0; i<totalTransactions; i++) {
			System.out.println("Transaction #"+i+":");
			arr[i]=scanner.nextInt();
		}
	}

	public void dailyTarget(int totalTargets) {
		int flag;
		for (int i=0; i<totalTargets; i++) {
			System.out.println("\nEnter the value of target:");
			targetValue=scanner.nextInt();
			sumOfTransactions=0;
			flag=0;
			for (int j=0;j<arr.length;j++) {
				sumOfTransactions=sumOfTransactions+arr[j];
				if (targetValue<=sumOfTransactions) {
					System.out.println("Transaction achieved after "+(j+1)+" transactions");
					flag=1;
					break;
				}
			}
			if (flag==0) {
				System.out.println("Given target is not achieved");
			}
		}
	}
}
