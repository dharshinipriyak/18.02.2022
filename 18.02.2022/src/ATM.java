import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int pin=6769;
		System.out.println("Welcome ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your pin :");
		if(pin==sc.nextInt())
		{
			atm();
		
		}else {
			System.out.println("XXX Pin is invalid XXX");
			System.out.println("Please Try again..!");
		}
		sc.close();
	}
	public static void atm() {
		int balance=100000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your desired option:");
		System.out.println("1.Withdraw\n2.Deposit\n3.Check Balance");
		String checker=sc.nextLine();
		switch(checker) {
		case "1":{
			System.out.println("Please enter the amount     :");
			balance-=sc.nextInt();
			System.out.println("Amount Withdraw Successfully");
			System.out.println("Your available balance is   :"+balance);
			break;
		}
		case "2":{
			System.out.println("Please enter the amount     :");
			balance+=sc.nextInt();
			System.out.println("Amount deposited successfully");
			System.out.println("Your available  balance is  :"+balance);
			break;
		}
		case "3":{
			System.out.println("Your Available balance is   :"+balance);
			break;
		}
		}
		System.out.println("Thank you for visiting our bank!");

		System.out.println("Please com back again :)");
		sc.close();
	}
}
