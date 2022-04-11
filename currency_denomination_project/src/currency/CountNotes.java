package currency;

import java.util.Arrays;
import java.util.Scanner;

public class CountNotes {
	private int allDenominations[],noOfNotes[];
	Scanner scanner = new Scanner(System.in);

	public void insertValues(int numberOfDenominations) {	
		allDenominations = new int[numberOfDenominations];
		noOfNotes = new int[numberOfDenominations];
		for (int i=0; i<numberOfDenominations; i++) {
			System.out.println("Denomination "+(i+1)+":");
			allDenominations[i]=scanner.nextInt();
		}

	}

	public void sortArray() {
		//Sort the denominations in ascending order
		Arrays.sort(allDenominations);
	}

	public void findNoOfNotes(int amountToPay) {
		try {
			for (int i=allDenominations.length-1; i>=0; i--) {
				if (amountToPay>=allDenominations[i]) {
					noOfNotes[i]=amountToPay/allDenominations[i];
					amountToPay=amountToPay%allDenominations[i];
				}
			}
			if (amountToPay==0) {
				System.out.println("Your payment approach in order to give min no of notes will be:");
				for (int j=allDenominations.length-1; j>=00; j--) {
					if (noOfNotes[j]!=0) {
						System.out.println(allDenominations[j]+":"+noOfNotes[j]);
					}
				}
			}
			else {
				System.out.println("Exact amount can't be paid with the given denominations!");
			}
		}
		catch (ArithmeticException e) {
			System.out.println(e+" Notes of denomination 0 are invalid");
		}
	}
}
