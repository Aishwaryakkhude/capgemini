package bank_service_impl;

import java.util.ArrayList;
import java.util.Scanner;

import bank_UI.MainBank;
import bank_service.BankServices;
import bean.bank_details;

public  class BankImpl implements BankServices{

	Scanner sc=new Scanner(System.in);

	ArrayList<bank_details>list=new ArrayList<bank_details>();
	bank_details e1=new bank_details(252588,"Aishwarya khude","Saving",60000);
	 bank_details e2=new bank_details(252589,"Aditya khude","Saving",70000);
	 public BankImpl()
	 {
		 
		list.add(e1);
		list.add(e2);
	 }
	@Override
	public void ShowAccountDetails() {
		if(list.size()==0)
		{
			System.out.println("No record found!!");
		}
		
		
		for(bank_details s1:list)
		{
			System.out.println(s1); 
		}
	}

	@Override
	public void SerchAccountByNum() {
		  
		System.out.print("Enter account no. you want to search: ");  
        int ac_no = sc.nextInt();  
        if(ac_no==252588)
        {
        	System.out.println(e1);
        }
        else if(ac_no==252589)
        {
        	System.out.println(e2);
        }
        else
        {
        	System.out.println("Search failed! Account doesn't exist..!!");  
        }
        	
       
        
        		
	}

	@Override
	public void DepositAmount() {
		System.out.print("Enter account no. you want to deposit:");  
        int ac_no = sc.nextInt();  
        if(ac_no==252588)
        {
        	System.out.println("Enter the amount you want to deposit: ");
        	long Amount=sc.nextLong();
        	Amount=e1.getBalance()+Amount;  
        	System.out.println("Amount Credited\n"+"Total Balence :"+Amount);
        	e1.setBalance(Amount);
        }
        else if(ac_no==252589)
        {
        	System.out.println("Enter the amount you want to deposit: ");
        	long Amount=sc.nextLong();
        	Amount=e2.getBalance()+Amount;  
        	System.out.println("Amount Credited\n"+"Total Balence :"+Amount);
        	e2.setBalance(Amount);
        }
        else
        {
        	System.out.println("Search failed! Account doesn't exist..!!");  
        }
	}

	@Override
	public void WithdrawAmount() {
		System.out.print("Enter account no. you want to withdraw Amount: ");  
        int ac_no = sc.nextInt();  
        if(ac_no==252588)
        {
        	System.out.println("Enter the amount you want to withdraw: ");
        	long Amount=sc.nextLong();
        	if(Amount<=e1.getBalance())
        	{
        		Amount=e1.getBalance()-Amount;  
            	System.out.println("Balance after withdrawal: "+Amount);
            	e1.setBalance(Amount);
        		
        	}
        	else
        	{
        		System.out.println("Your balance is less than " + Amount + "\tTransaction failed...!!" );
        	}
        }
        else if(ac_no==252589)
        {
        	System.out.println("Enter the amount you want to withdraw: ");
        	long Amount=sc.nextLong();
        	if(Amount<=e2.getBalance())
        	{
        		Amount=e2.getBalance()-Amount;  
            	System.out.println("Balance after withdrawal: "+Amount);
            	e2.setBalance(Amount);
        		
        	}
        	else
        	{
        		System.out.println("Your balance is less than " + Amount + "\tTransaction failed...!!" );
        	}
        }
        else
        {
        	System.out.println("Search failed! Account doesn't exist..!!");  
        }
		
	}

	

}
