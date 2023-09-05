package bank.com;
import java.util.Scanner;



public class BankMain {
	public static void main(String[] args) {
		ICICIBank ib = new ICICIBank();
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			System.out.println("1.create a/c 2.remove a/c 3.WithDraw 4.Deposit 5.ChangePswd 6.CheckBal 7.exit");
			switch(sc.nextInt())
			{
			case 1:
				
				ib.AddAccount();
				break;
			case 2:
				ib.removeAccount();
				break;
			case 3:
				ib.withdraw();
				break;
				
			case 4:
				ib.deposit();
				break;
				
			case 5:
				ib.ChangePswd();
				break;
			case 6:
				ib.CheckBal();
				break;
			case 7:
				return;
				
			}
		}
	}
}
