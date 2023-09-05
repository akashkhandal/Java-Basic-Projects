package co.hotel.project;

import java.util.Scanner;

public class SwiggyDriver {
	Account a;
	Hotel h;
	Scanner sc=new Scanner(System.in);
	public void login()
	{
		if(a==null)
		{
			System.out.println("enter name");
			String userName=sc.next();
			System.out.println("enter pswd");
			int pswd=sc.nextInt();
			System.out.println("etner address");
			String address=sc.next();
			System.out.println("enter cno");
			long cno=sc.nextLong();
		     a=new Account(userName,pswd,address,cno);
		      System.err.println("accout login ed.....");
		   
		}
		else
		{
			System.out.println("first make logout");
		}
	}
	public void logout()
	{
		if(a==null)
		{
			System.out.println("first make login");
		}
		else
		{
			a=null;
			System.err.println("logout.....................");
		}
		
	}
	public void addHotel()
	{
		if(a==null)
		{
			System.out.println("first make login......");
		}
		else
		{
			if(h==null)
			{
				System.out.println("1.veg 2.non veg");
				switch(sc.nextInt())
				{
				case 1:
					h=new Veg();
					System.out.println("you have choosed veg");
					break;
				case 2:
					h=new NonVeg();
					System.out.println("you have choosed non veg");
					break;
				}
			}
			else
			{
				System.out.println("already you choosed hotel");
			}
		}
		
	}
	public void removeHotel()
	{
		if(h==null)
		{
			System.out.println("please add hotel");
		}
		else
		{
			h=null;
			System.out.println("hotel is removed");
		}
	}
	public void orderfood()
	{
		if (h==null) 
		{
			System.out.println("please select hotel");
			
		}
		
	}
	public void cancelFood()
	{
		
	}
	public void displayBill()
	{
		
	}
    public void exit()
    {
    	
    }

}
