package bean;

public class bank_details {
	private int account_no;
	private String name;
	private String account_type;
	private long balance;
	//https://www.javatpoint.com/banking-application-in-java
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "bank_details [account_no=" + account_no + ", name=" + name + ", account_type=" + account_type
				+ ", balance=" + balance + "]";
	}
	public bank_details(int account_no, String name, String account_type, long balance) {
		super();
		this.account_no = account_no;
		this.name = name;
		this.account_type = account_type;
		this.balance = balance;
	}
	
	
	
	
}
