package com.hello;

public class BankAccount {
	String customerName;
	String address;
	double balance;
	
	public BankAccount(String customerName, String address, double balance) {
		this.customerName = customerName;
		this.address = address;
		this.balance = balance;
	}
	public BankAccount() {
		this.customerName = "NA";
		this.address = "NA";
		this.balance = 0.0;
	}
	public void deposite(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("deposited : " + amount);
		}
		else {
			System.out.println("Invalid amount. deposite failed");
		}
	}
	public void withdrawal(double amount) {
		if(amount > 0 && amount <= balance) {
			this.balance -= amount;
			System.out.println("Withdrawal : " + amount);
		}
		else {
			System.out.println("Insufficient funds. Withdrawal failed");
		}
	}
	public void updateAddress(String newAddress) {
		this.address = newAddress;
		System.out.println("Address uploaded successfully to : " + newAddress);
	}
	public void updateCustomerName(String newCustomerName) {
		this.customerName = newCustomerName;
		System.out.println("Customer Name uploaded successfully to : " + newCustomerName);
	}
	public void displayBankAccountDetails() {
		System.out.println("Customer Name : " + customerName + "\nAddress" + address + "\nBalance : " + balance);
	}
}
