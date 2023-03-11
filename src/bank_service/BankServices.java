package bank_service;

import bank_service_impl.BankImpl;
import bean.bank_details;

public interface BankServices {
	
	public  void ShowAccountDetails();
	public void SerchAccountByNum();
	public void DepositAmount();
	public void WithdrawAmount();
	

}
