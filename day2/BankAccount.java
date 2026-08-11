package Encapsulation;

public class BankAccount {
	private int accNo;
	private String name;
	private int age;
	private String gender;
	private long phoneNo;
	private String address;
	private String accType;
	private double balance;
	BankAccount(int accNo,String name,int age,String gender,long phoneNo,String address,String accType,double balance){
	this.accNo = accNo;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.phoneNo = phoneNo;
	this.address =address;
	this.balance = balance;
	this.accType = accType;
}
public double checkBalance() {
	System.out.println("Current bank balance: "+balance);
	return balance;
}
public void withDrawal(int amount) {
	if(amount>balance) {
		System.out.println("Insufficient balance!!");
	}
	else {
		balance -=amount;
		System.out.println("Amount Withdrawn Successfully!!");
		System.out.println("Avaliable balance: "+balance);
	}
	
}
public void deposit(int amount) {
	balance+=amount;
	System.out.println("Amount Deposited Successfully!!");
	System.out.println("Current Balance: "+balance);
}
public void getDetails(){
	System.out.println("Account number: "+accNo);
	System.out.println("Account Holder Name: "+name);
	System.out.println("Account type: "+ accType);
	System.out.println("Current Balance :"+balance);
}
}


