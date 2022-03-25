import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int pin=6769;
		System.out.println("Welcome ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your pin           :");
		if(pin==sc.nextInt())
		{
			atm();
		
		}else {
			System.out.println("Pin is incorrect");
			System.out.println("Try again by removing"+"and inserting the card again");
		}
		sc.close();
	}
	public static void atm() {
		int balance=100000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your desired option:");
		String checker=sc.nextLine();
		switch(checker) {
		case "withdraw":{
			System.out.println("Please enter the amount     :");
			balance-=sc.nextInt();
			System.out.println("your balance is"+balance+"  :");
			break;
		}
		case "deposit":{
			System.out.println("Please enter the amount     :");
			balance+=sc.nextInt();
			System.out.println("your balance is"+balance+"  :");
			break;
		}
		case "check balance":{
			System.out.println("your balance is "+balance+"  :");
			break;
		}
		}
		System.out.println("Thank you for visiting our bank!");

		System.out.println("please com back again :)");
		sc.close();
	}
}
