package p1;

public class Customer {

	String lastName;
	String firstName;
	String phone;
	String accountNumber;
	double balance;
	
	public Customer(String firstName, String lastName, String phoneNumber, String accountNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phoneNumber;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAccountnumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return (accountNumber + " " + firstName + " " + lastName + " " + phone + " " + balance);
	}
	
}
