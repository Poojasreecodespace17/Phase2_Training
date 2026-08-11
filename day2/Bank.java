package Encapsulation;

public class Bank {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(101,"John",44,"Male",901828392,"Coimbatore","joint account",15000);
		b1.withDrawal(2000);
		b1.deposit(8000);
		b1.getDetails();
	}

}
