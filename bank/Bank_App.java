package bank;

import java.util.Scanner;

public class Bank_App {
	
	int balance;
	int withdraw;
	int previewTransaction;
	int deposit;
	String userName;
	int userId;
	int pin=3232;
	
	Bank_App(String userName,int userId)
	{
		this.userName=userName;
		this.userId=userId;
	}
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\t\t\t\tEnter deposite amount=");
		int amount=sc.nextInt();
		balance=balance+amount;
		previewTransaction=amount;
		System.out.println("Amount deposited");
	}
	public void checkBalance()
	{
		System.out.println("Current Balance Amount="+balance);
		
	}
	
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\t\t\t\tEnter Withdraw amount=");
		int amount=sc.nextInt();
		int ch_b=balance-amount;
		if(ch_b>=0)
		{
			balance=balance-amount;
			previewTransaction=-amount;
			System.out.println("Amount withdraw");
		}
		else if(ch_b<0)
		{
			System.out.println("Insufficient balance");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	public void transaction()
	{
		
		if(previewTransaction>0)
		{
			System.out.println("Previous Deposited amount=₹"+previewTransaction);
		}
		else if(previewTransaction<0)
		{
			System.out.println("Previous Withdraw amount=₹"+Math.abs(previewTransaction));
		}
		else {
			System.out.println("No transaction occured");
		}
		
		
	}
	public void show()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("********************************************************************************************************************");
		System.out.println("\t\t\t\tWELCOME TO SBI");
		System.out.println("********************************************************************************************************************");

		
		System.out.println("\t\t\t\tUSERNAME:"+userName);
		System.out.println("\t\t\t\tUSERID:"+userId);
		
		System.out.println("********************************************************************************************************************");
		boolean accept=true;
		do {
			
			System.out.println("select option");
			System.out.println("1.English");
			System.out.println("2.Tamil");
			int input=sc.nextInt();
			System.out.print("\t\t\tEnter pin:");
			int p1=sc.nextInt();
			
			if(p1==pin)
			{
			
			do {
				
				System.out.println("\t\t\t\tSelect the option👇");
				System.out.println("\t\t\t\t1.Check Balance");
				System.out.println("\t\t\t\t2.Cash Withdraw");
				System.out.println("\t\t\t\t3.Cash Deposite");
				System.out.println("\t\t\t\t4.Last Transaction");
				System.out.println("\t\t\t\t5.Exit");
				
				int inp=sc.nextInt();
				
				switch (inp) {
				case 1: {
					
					checkBalance();
					break;
				}
				case 2:
				{
					withdraw();
					break;
				}
				case 3:
				{
					deposit();
					break;
				}
				case 4:
				{
					transaction();
					break;
				}
				case 5:{
					accept=false;
					System.out.println("Thank you for visit our site....");
					break;
					
				}
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + inp);
				}
				
				
			}while(accept);
			}
			else {
				System.out.println("Invalid pin number...");
			}
			
		} while (false);
		
		
		
		
		
		
		
		
		
	}

}
