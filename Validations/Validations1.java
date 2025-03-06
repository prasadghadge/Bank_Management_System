package com.exponent.bankapplication.Validations;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Validations1 {

	public static String validateAccountHolderName()
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		
		char[] nameArray = name.toCharArray();
		
		boolean flag = true;
		for(int i = 0;i<nameArray.length;i++)
		{
			if(!(name.charAt(i) >= 'a' && name.charAt(i) <= 'z') && !(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'))
			{
				flag = false;
			}
		}
		
		if(!flag)
		{
			System.out.println("Invalid Input");
			return validateAccountHolderName();
		}
		
		else
		{
			return name;
		}
		
	}
	
	public static String validateAadhaarNumber()
	{
	  	Scanner sc = new Scanner(System.in);
	  	System.out.println("Enter aadhaar number");
	  	String aadhaarNo = sc.next();
	  	
	  	boolean flag = true;
	  	
	  	if(aadhaarNo.length() != 16)
	  	{
	  		flag = false;
	  	}
	  	if(!flag)
		{
			System.out.println("Invalid Input");
			return validateAadhaarNumber();
		}
		
		else
		{
			return aadhaarNo;
		}
	  	
	}
	
	
	public static String validatePanCardNumber()
	{
		Scanner sc = new Scanner(System.in);
	  	System.out.println("Enter pancard number");
	  	String panCardNo = sc.next();
	  	boolean flag = true;
	  if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", panCardNo))
	  {
		  flag = false;
	  }
	  
	  if(!flag)
		{
		  return panCardNo;
		}
		
		else
		{
			System.out.println("Invalid Input");
			return validatePanCardNumber();
		}
	  
	  	
	}
	
	public static String validateMobileNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile number");
		String mobileNo = sc.next();
		boolean flag = true;
		if(Pattern.matches("^\\+91[6-9]\\d{9}$", mobileNo))
		{
			flag = false;
		}
		
		if(!flag)
		{
			return mobileNo;
		}
		
		else
		{
			System.out.println("Invalid Input");
			return validateMobileNumber();
		}
	}
	
	public static String validateEmailId()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmailId");
		String EmailId = sc.next();
		boolean flag = true;
		if(Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$" , EmailId))
		{
			flag = false;
		}
		
		if(!flag)
		{
			return EmailId;
		}
		
		else
		{
			System.out.println("Invalid Input");
			return validateEmailId();
		}
	}
	
}
