package com.hello;
import com.hello.BankAccount;

public class BankApp {
	public static void main(String[] args) {
	BankAccount b = new BankAccount();
	b.displayBankAccountDetails();
	System.out.println("----------------------------------");
	BankAccount b1 = new BankAccount("Alice", "123 Street", 1000);
	b1.displayBankAccountDetails();
	b1.deposite(2000);
	b1.deposite(-1000);
	b1.displayBankAccountDetails();
	b1.withdrawal(-9000);
	b1.withdrawal(40000);
	b1.withdrawal(200);
	b1.updateAddress("123 KPHB");
	b1.updateCustomerName("Ameer Shaik");
	b1.displayBankAccountDetails();
}
}