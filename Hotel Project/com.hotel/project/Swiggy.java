package co.hotel.project;


import java.util.Scanner;

public class Swiggy {

	Account a;
	Hotel h;
	public Scanner sc=new Scanner(System.in);
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
			
			System.out.println();
		}
	}
	public void logout()
	{
		if(a==null)
		{
			System.out.println("first make login");
			System.out.println();
		}
		else
		{
			a=null;
			System.out.println("logout.....................");
			System.out.println();
		}
		
	}
	public void addHotel()
	{
		if(a==null)
		{
			System.out.println("first make login......");
			System.out.println();
		}
		else
		{
			if(h==null)
			{
				System.out.println("1.veg 2.non veg");
				System.out.println();
				
				switch(sc.nextInt())
				{
				case 1:
					h=new Veg();
					System.out.println("you have choosed veg");
					System.err.println(" Enter 4 to Order food");
					System.out.println();
					break;
				case 2:
					h=new NonVeg();
					System.out.println("you have choosed non veg");
					System.err.println(" Enter 4 to Order food");
					System.out.println();
					break;
				}
			}
			else
			{
				System.out.println("already you choosed hotel");
				System.err.println("Now enter 4 to order food");
				System.out.println();
			}
		}
		
	}
	public void removeHotel()
	{
		if(h==null)
		{
			System.out.println("please add hotel");
			System.err.println("Enter 3 to Add Hotel");
			System.out.println("");
		}
		else
		{
			h=null;
			System.out.println("hotel is removed");
			System.err.println("Enter 3 to Add Hotel");
			System.out.println();
		}
	}
	public void orderfood()
	{
		if (h==null) 
		{
			System.out.println("please select hotel");
			System.err.println("Enter 3 to Add Hotel");
			System.out.println();
			
		}
		else
		{
			if (h instanceof Veg)
			{
				Veg v = (Veg)h;
				for (;;)
				{
				
			System.out.println("you choosed Veg");
			System.out.println("Now choose Menu");
			System.out.println(" Items"+"                        "+" price");
			System.out.println("1." + v.food1 +"               "+v.priceNaan);       
			System.out.println("2." + v.food2 +"               "+v.priceRoti);
			System.out.println("3." + v.food3 +"       "+v.pricePannerButterMasala);
			System.out.println("4. enough order ");
			
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("you selected naan");
                System.out.println("enter quantity ");
                System.out.println("");
                v.qtyNan = sc.nextInt();
				System.out.println("you added = "+v.qtyNan+" Naan");
				
				break;
				
			case 2:
				System.out.println("you selected roti");
				System.out.println("enter quantity ");
				System.out.println("");
				v.qtyRoti =sc.nextInt();
				
				
				System.out.println("you added = "+v.qtyRoti+" Roti");
				break;
				
			case 3:
				System.out.println("you selected PaneerButterMasala");
				System.out.println("enter quantity ");
				System.out.println("");
				v.qtyPannerButtterMasala = sc.nextInt();
				System.out.println("you added = "+v.qtyPannerButtterMasala+" PannerButterMasala");
				break;
			case 4:
				System.out.println("Order is preparing");
				System.out.println("Enter 6 to Check Bill");
				System.out.println("");
				return;
			}
			}
			}
		
			else if (h instanceof NonVeg)
			{
				NonVeg v1 = (NonVeg)h;
				for(;;)
				{
			System.out.println("You choosed NonVeg");
			System.out.println("");
			System.out.println("Now choose Menu");
			System.out.println("     Items                   price");
			System.out.println("1. "+v1.food1  +"           " + v1.priceCshawarma);
			System.out.println("2. "+v1.food2  +"            " + v1.pricebriyanih+"/"+v1.pricebriyanif);
			System.out.println("3. "+v1.food3  +"                 " + v1.priceRoti);
			System.out.println("4. "+v1.cgravy +"              " + v1.cgravyprice);
			System.out.println("5. "+v1.mgravy +"              " + v1.mgravyprice);
			System.out.println("6. enough order ");
			System.out.println("");
			
			
			switch(sc.nextInt())	
			{
			
			case 1:
				System.out.println("you selected C.Sharwama");
				System.out.println("enter Quantity ");
				System.out.println("");
			    v1.qtycShawarma =sc.nextInt();
				System.out.println("you added = "+ v1.qtycShawarma+" C.Shawarma");
				
				break;
			case 2 :
				System.out.println("1.Half Briyani  2.Full Briyani");
				System.out.println("");
				switch(sc.nextInt())
				{
				case 1:
				System.out.println("you selected C.Briyani Half");
	            System.out.println("enter Quantity ");
	            System.out.println("");
				v1.qtybriyanihalf=sc.nextInt();
				System.out.println("you added = "+v1.qtybriyanihalf+" Half Briyani");
				
				break;
				
			case 2:
				
				System.out.println("you selected C.Briyani Full");
				System.out.println("enter Quantity ");
				v1.qtybriyanifull=sc.nextInt();
				System.out.println("");
				System.out.println("you added = "+v1.qtybriyanifull+" Full Briyani");
			
				}
				break;
				
			case 3:
				System.out.println("you selected  Roti ");
				System.out.println("enter quantity ");
				System.out.println("");
				v1.qtyRoti = sc.nextInt();
				System.out.println("you added = "+v1.qtyRoti+" Roti");
				break;
			
			case 4:
				System.out.println("you selected   C.Gravy ");
				System.out.println("enter quantity ");
				System.out.println("");
				v1.cgravyqty = sc.nextInt();
				System.out.println("you added = "+v1.cgravyqty+" C.Gravy");
				break;
			case 5:
				System.out.println("you selected  M.Gravy");
				System.out.println("enter quantity ");
				System.out.println("");
				v1.mgravyqty = sc.nextInt();
				System.out.println("you added = "+v1.mgravyqty+" M.Gravy");
				break;
			case 6:
				System.out.println("order is preparing.......");
				System.out.println(" Enter 6 to check Bill");
				System.out.println("");
				return;
				 
			
			}
				}
			}
		}
		
		
	}
	public void cancelFood()
	{
		if (a==null) {
			System.out.println("first login");
			System.out.println("");
		}
		else if (h==null) {
			System.out.println("first select hotel");
			System.out.println("");
			
		} 
		else {
			h=null;
			System.out.println("food cancelled");
			System.out.println("");
		}
			
		}
		
	
	public void displayBill()
	{
		if (a==null) 
		{
			System.out.println("first login");
			System.out.println("");
		}
		else
		{
			if(h==null) 
			{
		
			System.out.println("first select hotel");
			System.out.println("");
			}
			else if(h instanceof Veg)
			{
				Veg v1=(Veg)h;
				int sum=0;
				System.out.println("----Food Item-----Quantity----Price----");
				if(v1.qtyNan!=0)
				{
					System.out.println(v1.food1+"              "+v1.qtyNan+"         = "+v1.qtyNan*v1.priceNaan);
				   sum=(int) (sum+(v1.qtyNan*v1.priceNaan));
				}
				 if(v1.qtyRoti!=0)
				{
					System.out.println(v1.food2+"              "+v1.qtyRoti+"         = "+v1.qtyRoti*v1.priceRoti);
					   sum=(int) (sum+(v1.qtyRoti*v1.priceRoti));
				}
				 if(v1.qtyPannerButtterMasala!=0)
				{
					System.out.println(v1.food3+"  "+v1.qtyPannerButtterMasala+"        = "+v1.qtyPannerButtterMasala*v1.pricePannerButterMasala);
					   sum=(int) (sum+(v1.qtyPannerButtterMasala*v1.pricePannerButterMasala));
				}
				 System.out.println("Total Bill                    = "+sum);
				 System.out.println("======================================= ");
				 System.out.println("you have to pay "+sum);
				 System.out.println("");
				if(sum>=1000)
				{
				
				System.out.println("you got 10% discount on purchase of more than 1000");
				int charges1 = sum*10/100;
				System.out.println("10%discount on bill =           "+charges1+"/-");
				int charges2 = sum-charges1;
				System.out.println("You have to pay now =           "+charges2+"/-");
				System.out.println("======================================= ");
				double money=sc.nextDouble();
				System.out.println("");
				if(money>=charges2)
				{
					System.out.println("order  confirmed");
					System.out.println("");
					h=null;
				}
				else
				{
					System.out.println("order is not confirmed");
					System.out.println("");
				}
				}
				else if(sum<1000)
				{
					System.out.println("no discount");
					double money=sc.nextDouble();
					if(money>=sum)
					{
						System.out.println("order  confirmed");
						System.out.println("");
						h=null;
					}
					else
					{
						System.out.println("order is not confirmed");
						System.out.println("");
					}
				}
			}
			else if(h instanceof NonVeg)
			{
				NonVeg v2=(NonVeg)h;
				int sum1 =0;
				System.out.println("----Food Item-----Quantity----Price----");
				if(v2.qtycShawarma!=0)
				{
					System.out.println(v2.food1+"         "+v2.qtycShawarma+"       = "+v2.qtycShawarma*v2.priceCshawarma);
					sum1=(int) (sum1+(v2.qtycShawarma*v2.priceCshawarma));
				}
				if(v2.qtybriyanihalf!=0)
				{
					System.out.println(v2.food2+"          "+v2.qtybriyanihalf+"       = "+v2.qtybriyanihalf*v2.pricebriyanih);
					sum1=(int) (sum1+(v2.qtybriyanihalf*v2.pricebriyanih));
				}
				if(v2.qtybriyanifull!=0)
				{
					System.out.println(v2.food2+"            "+v2.qtybriyanifull+"       = "+v2.qtybriyanifull*v2.pricebriyanif);
					sum1=(int) (sum1+(v2.qtybriyanifull*v2.pricebriyanif));
				}
				if(v2.qtyRoti!=0)
				{
					System.out.println(v2.food3+"                "+v2.qtyRoti+"       = "+v2.qtyRoti*v2.priceRoti);
					sum1=(int) (sum1+(v2.qtyRoti*v2.priceRoti));
				}
				if(v2.cgravyqty!=0)
				{
					System.out.println(v2.cgravy+"             "+v2.cgravyqty+"       = "+v2.cgravyqty*v2.cgravyprice);
					sum1=(int) (sum1+(v2.cgravyqty*v2.cgravyprice));
				}
				if(v2.mgravyqty!=0)
				{
					System.out.println(v2.mgravy+"             "+v2.mgravyqty+"          = "+v2.mgravyqty*v2.mgravyprice);
					sum1=(int) (sum1+(v2.mgravyqty*v2.mgravyprice));
				}
				System.out.println("======================================= ");
				System.out.println("You have to pay         "+sum1+"/-");
				
				if(sum1>=1000)
				{
				
				System.out.println("you got 10% discount on purchase of more than 1000");
				int charges1 = sum1*10/100;
				System.out.println("10%discount on bill =           "+charges1+"/-");
				int charges2 = sum1-charges1;
				System.out.println("You have to pay now =           "+charges2+"/-");
				System.out.println("======================================= ");
				System.out.println("Enter The Amount To Conform Order");
				double money=sc.nextDouble();
				if(money>=charges2)
				{
					System.out.println("order  confirmed");
					h=null;
				}
				else
				{
					System.out.println("order is not confirmed");
				}
				}
				else if(sum1<1000)
				{
					System.out.println("no discount");
					double money=sc.nextDouble();
					if(money>=sum1)
					{
						System.out.println("order  confirmed");
						h=null;
					}
					else
					{
						System.out.println("order is not confirmed");
					}
				}
				//System.err.println("your order is placed");
				//System.err.println("Thank you order again.......");
				
				
				
			}
			
		} 
		
		
	}
    public void exit()
    {
    	
    }
    public static void main(String[] args) 
    {
    	Swiggy s=new Swiggy ();
    	for(;;)
    	{
    		
    	System.out.println("1.login 2.logout 3.addhotel 4.order food 5.cancel food 6.display bill 7.exit 8.remove hotel");
    	  switch(s.sc.nextInt())
    	  {
    	  case 8:
    		  s.removeHotel();
    		  break;
    	  case 1:
    		  s.login();
    		  break;
    	  case 2:
    		  s.logout();
    		  break;
    	  case 3:
    		  s.addHotel();
    		  break;
    	  case 4:
    		  s.orderfood();
    		  break;
    	  case 5:
    		  s.cancelFood();
    		  break;
    	  case 6:
    		  s.displayBill();
    		  break;
    	  case 7:
    		  System.out.println("application is closed");
    		  return;
    		  
    		  
    		  
    	  }
    	}
		
	}
}
