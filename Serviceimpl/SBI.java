package com.exponent.bankapplication.Serviceimpl;
import com.exponent.bankapplication.Validations.Validations1;
import java.util.Scanner;
import com.exponent.bankapplication.model.Account;
import com.exponent.bankapplication.Service.*;
public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	
	Account[] a = new Account[5];
	int count = 0;
	public void createAccount() {
		
		
	System.out.println("Enter how many accont you want to add ");
	int noOfAccount = sc.nextInt();
	
//	System.out.println("Enter your name ");
//	String a = sc.next();
	
	for(int i=0;i<noOfAccount;i++)
	{

		Account ac = new Account();
		System.out.println("Enter account No");
		ac.setAccountNo(sc.nextInt());
	 ac.setAccountName(Validations1.validateAccountHolderName());
	 
	ac.setAadharCard(Validations1.validateAadhaarNumber());
	
	
	ac.setPanCard(Validations1.validatePanCardNumber());
	
//	System.out.println("Enter contact number ");
	ac.setContact(Validations1.validateMobileNumber());
//	
//	System.out.println("Enter your mail ");
	ac.setMail(Validations1.validateEmailId());
//	
	System.out.println("Enter your account balance");
	ac.setAccountBalance(sc.nextDouble());
	
	a[i] = ac;
	count++;
	System.out.println("Successfully account created ");
	
	}
	}

	
	public void showAccountDetails() {
		
		System.out.println("--------Display all account details---------");
		for(Account acn : a)
		{
			if(acn != null)
			{
			System.out.println(acn);
			}
			}
	}

	
	public void showAccountBalance() {
		System.out.println("Enter account number");
		int accNo = sc.nextInt();
		for(int i = 0;i<count;i++)
		{
		if(accNo==a[i].getAccountNo() && a[i] != null )
		{
			
			System.out.println("Current account balance "+a[i].getAccountBalance());
			break;
		}
		
		else {
			System.out.println("Account doesn't exist");
		}
		}
		
		
	}

	
	public void depositMoney() {
		
		System.out.println("Enter account number ");
		int accNo = sc.nextInt();
		for(int i = 0; i<count;i++)
		{
		if(accNo==a[i].getAccountNo())
		{
			System.out.println("Enter amount which you want to deposit");
			
			double depositAmount =sc.nextDouble();
			double updateAccountBalance = a[i].getAccountBalance() + depositAmount;
			a[i].setAccountBalance(updateAccountBalance);
			
			System.out.println("Current Balance "+a[i].getAccountBalance());
			System.out.println("Deposited successfully");
			
		}
		
		else {
			System.out.println("Account doesn't exist");
		}
		}
	}

	
	public void withdrawMoney() {
		System.out.println("Enter account number ");
		int accNo = sc.nextInt();
		for(int i = 0; i<count;i++)
		{
		if(accNo==a[i].getAccountNo())
		{
			
			System.out.println("Enter amount which you want to withdraw");
			
			double withdrawAmount = sc.nextDouble();
			if(withdrawAmount <= a[i].getAccountBalance())
			{
				double updateAccountBalance = a[i].getAccountBalance() - withdrawAmount;
				a[i].setAccountBalance(updateAccountBalance);
				
				System.out.println("Current Balance "+a[i].getAccountBalance());
				System.out.println("Withdraw successfully ");
			}
			
			else {
				System.out.println("Insufficient balance");
			}	
		}
		
		else {
			System.out.println("Account doesn't exist");
		}
		}	
	}
	
	public void displaySingleAccount()
	{
		System.out.println("Enter account no");
		int accNo = sc.nextInt();
		for(Account acn : a)
		{
		if(acn != null && acn.getAccountNo() == accNo)
		{
			System.out.println(acn);
		}
			
		}
		}

	
	public void updateAccountDetails() {
		
	boolean flag = true;
	
	System.out.println("Enter account number ");
	int accNo = sc.nextInt();
	
	for(int i = 0; i<count; i++)
	{
	if(accNo == a[i].getAccountNo())
	{
	while(flag)
	{
		System.out.println("*****************************");
		System.out.println("1. Update name");
		System.out.println("2. Update mobile number ");
		System.out.println("3. Update emailId");
		System.out.println("4. Exit");
		System.out.println("*****************************");
		
		System.out.println("Enter your chioce from 1 to 4");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter new name ");
			String newName = sc.next();
			a[i].setAccountName(newName);
			System.out.println("Name changed successfully");
			break;
				
		case 2:
			System.out.println("Enter new mobile number");
			String newMobileNo = sc.next();
			a[i].setContact(newMobileNo);
			System.out.println("Mobiele No changed successfully");
			break;
			
		case 3:
			System.out.println("Enter new emailId");
			String newEmailId = sc.next();
			a[i].setMail(newEmailId);
			System.out.println("EmailId changed successfully");
			break;
			
		case 4:
			flag = false;
			break;
			
		default:
			System.out.println("You enter incorrect choice");
			
			
		}
	}
	}
	
	else {
		System.out.println("Account doesn't exist");
	}
	}
	}

	
}
