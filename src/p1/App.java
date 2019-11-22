package p1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 5;
//		// class is a data type
//		Customer c1 = new Customer("John", "Doe", "6312029454", "986456841687", 1000.00);
////		System.out.printf("%-8s%8s%12s%10s%10.2f\n", c1.getAccountnumber(),
////													c1.getFirstName(),
////													c1.getLastName(),
////													c1.getPhone(),
////													c1.getBalance());
//		
//		Customer c2 = new Customer("John", "Doe", "6311234567", "46546548847", 100000.00);
////		System.out.printf("%-8s%8s%12s%10s%10.2f\n", c2.getAccountnumber(),
////													c2.getFirstName(),
////													c2.getLastName(),
////													c2.getPhone(),
////													c2.getBalance());
////		
////		System.out.println(c1);
////		System.out.println(c2);
//		// array of data type
//		Customer[] customers = new Customer[5];
//		customers[0] = c1;
//		customers[1] = c2;
//		System.out.println(customers[0]);
//		
		int count = 0;
		Customer[] customers = new Customer[10000];
		while (count < 5) {
			Customer c1 = createAccount();
			System.out.println(c1);
			customers[count++] = c1;
		}
}
	
	public static Customer createAccount() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter first name: ");
		String fName = input.nextLine();
		System.out.println("enter last name: ");
		String lName = input.nextLine();
		System.out.println("enter phone number: ");
		String phone = input.nextLine();
		System.out.println("enter account number: ");
		String accountNumber = input.nextLine();
		System.out.println("enter the balance: ");
		double balance = Double.parseDouble(input.nextLine());
		
		Customer c = new Customer(fName, lName, phone, accountNumber, balance);
		return c;
	}
}
