package bank_UI;

import java.util.Scanner;

import bank_service.BankServices;
import bank_service_impl.BankImpl;
import bean.bank_details;

public class MainBank {

	public static void main(String[] args) 
	{
		
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.print("-- Welcome To Indian Bank --");
		System.out.print("\n=================================");
		
		
		
		BankImpl e=new BankImpl();
		do {
			System.out.println("\n=================================");
			System.out.println("1.Display Account Details");
			System.out.println("2.Search Account Information by Account Number ");
			System.out.println("3.Deposit the amount");
			System.out.println("4.Withdraw the amount");
			System.out.println("5.Exit");
			System.out.println("\n=================================");
			System.out.println(" Enter the Choise ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
					e.ShowAccountDetails();
			break;
			case 2:
				e.SerchAccountByNum();
				break;
			case 3:
				e.DepositAmount();
				break;
			case 4:
				e.WithdrawAmount();
				break;
			}
			System.out.println("do you want to continue");
	    	s=sc.next();
		}
		while(s.equals("yes"));
		
			
}
}