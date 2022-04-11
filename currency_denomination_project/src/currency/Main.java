package currency;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfDenominations,amountToPay;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations:");
		numberOfDenominations=scanner.nextInt();

		CountNotes countnotes=new CountNotes();

		System.out.println("Enter the denomination values\n");
		countnotes.insertValues(numberOfDenominations);

		//Sort the array
		countnotes.sortArray();

		System.out.println("Enter the amount you want to pay:");
		amountToPay=scanner.nextInt();

		//find the required number of currency denominations
		countnotes.findNoOfNotes(amountToPay);

		scanner.close();

	}
}
