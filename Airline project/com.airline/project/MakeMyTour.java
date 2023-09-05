package co.airline.project;


import java.util.Scanner;
public class MakeMyTour {
	Airlines a;
	User u;
	static int people ;
	static Double sum;
	Scanner sc = new Scanner(System.in);
	public void login()
	{
		if(u==null)
		{
			System.out.println("enter name");
			String userName=sc.next();
			System.out.println("enter pswd");
			int pswd=sc.nextInt();
			System.out.println("etner address");
			String address=sc.next();
			System.out.println("enter cno");
			long cno=sc.nextLong();
		     u=new User(userName,pswd,address,cno);
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
		if(u==null)
		{
			System.out.println("first make login");
			System.out.println();
		}
		else
		{
			u=null;
			System.out.println("logout.....................");
			System.out.println();
		}
		
	}
	public void BookTickets()
	{
		if(u==null)
		{
			System.out.println("first make login");
			System.out.println();
		}
		
		 else
		 {
			 if(a==null)
			 {
				/* Airlines a1 = new Airlines();
				 
				 System.out.println("From");
					a1.from=sc.next();
					System.out.println("To");
					a1.to=sc.next();
					System.out.println("Date");
					a1.date=sc.next();
					System.out.println("");
					*/
				 System.out.println("1.Indigo 2.AirIndia 3.AirAsia");
					System.out.println();
					switch(sc.nextInt())
					{
					case 1:
					{
						a=new Indigo();
						System.out.println("you have choosed Indigo Airlines");
						//System.err.println(" Enter 4 to Order food");
						System.out.println();
						Indigo i =(Indigo)a;
						//Indigo i2 =(Indigo)a;
						
						
						
							System.out.println("From");
							i.from=sc.next();
							System.out.println("To");
							i.to=sc.next();
							System.out.println("Date");
							i.date=sc.next();
							System.out.println("");
					     	System.out.println("Add Number of peoples");
							people=sc.nextInt();
							for(int x=0;x<people;x++)
							{
						
								
								
								System.out.println("Enter Name");
								i.Name = sc.next();
								//System.out.println("");
								System.out.println("Age");
								i.Age=sc.nextInt();
								
								System.out.println("Gender M/F");
								i.Gender=sc.next().charAt(0);
								System.out.println("Mobile no.");
								i.MobNo=sc.nextLong();
								System.out.println("Email ID.");
								i.Emailid=sc.next();
								System.out.println("Adhar No.");
								i.Adhar=sc.nextLong();
								System.out.println("Are you Vaccinated..? Y/N");
								i.Vac=sc.next().charAt(0);
								System.out.println("");
							    
							}
							
							
					
							
						
							
							if(i.Vac=='Y'||i.Vac=='y')
							{
								System.out.println("You are eligible to book");
								System.out.println("");
							
								System.out.println("");
								System.out.println("Charges per person = "+i.Price+"/-");
								Double sum=(i.Price*people);
								System.out.println("You Added = "+people+" peoples");
								
								
								System.out.println("you have to pay = "+sum+"/-");
								
							
								double money = sc.nextInt();
								
								if(money>=sum)
								{
									System.out.println("Booking Confimed");
								}
								else
								{
									System.out.println("payment unsuccessfull3");
								}
							}
							else
							{
								System.out.println("you are not eligible");
							}
							
							
							
							
							
							
							
							
							
						
					}
					       break;
					case 2:
						a=new AirIndia();
						System.out.println("you have choosed AirIndia Airlines");
						//System.err.println(" Enter 4 to Order food");
						System.out.println();
						AirIndia Ai =(AirIndia)a;
						
						
						System.out.println("From");
						Ai.from=sc.next();
						System.out.println("To");
						Ai.to=sc.next();
						System.out.println("Date");
						Ai.date=sc.next();
						System.out.println("Add Number of peoples");
						people=sc.nextInt();
						for(int x=0;x<people;x++)
						{
						System.out.println("");
						System.out.println("Enter Name");
						Ai.Name = sc.next();
						//System.out.println("");
						System.out.println("Age");
						Ai.Age=sc.nextInt();
						System.out.println("Gender M/F");
						Ai.Gender=sc.next().charAt(0);
						System.out.println("Mobile no.");
						Ai.MobNo=sc.nextLong();
						System.out.println("Email ID.");
						Ai.Emailid=sc.next();
						System.out.println("Adhar No.");
						Ai.Adhar=sc.nextLong();
						System.out.println("Are you Vaccinated..? Y/N");
						Ai.Vac=sc.next().charAt(0);
						System.out.println("");
						}
						if(Ai.Vac=='Y'||Ai.Vac=='y')
						{
							System.out.println("You are eligible to book");
							System.out.println("");
							//System.out.println("Payment = "+Ai.Price);
							System.out.println("Charges per person = "+Ai.Price+"/-");
							Double sum=(Ai.Price*people);
							System.out.println("You Added = "+people+" peoples");
							
							
							System.out.println("you have to pay = "+sum+"/-");
							double money = sc.nextInt();
							
							if(money>=sum)
							{
								System.out.println("Booking Confimed");
							}
							else
							{
								System.out.println("payment unsuccessfull3");
							}
						}
						else
						{
							System.out.println("you are not eligible");
						}
						
						break;
						
					case 3:
						a=new AirAsia();
						System.out.println("you have choosed AirAsia Airlines");
						//System.err.println(" Enter 4 to Order food");
						System.out.println();
						AirAsia Aa =(AirAsia)a;
						
						
					     System.out.println("From");
						Aa.from=sc.next();
						System.out.println("To");
						Aa.to=sc.next();
						System.out.println("Date");
						Aa.date=sc.next();
						System.out.println("Add Number of peoples");
						people=sc.nextInt();
						for(int x=0;x<people;x++)
						{
						System.out.println("");
						System.out.println("Enter Name");
						Aa.Name = sc.next();
						//System.out.println("");
						System.out.println("Age");
						Aa.Age=sc.nextInt();
						System.out.println("Gender M/F");
						Aa.Gender=sc.next().charAt(0);
						System.out.println("Mobile no.");
						Aa.MobNo=sc.nextLong();
						System.out.println("Email ID.");
						Aa.Emailid=sc.next();
						System.out.println("Adhar No.");
						Aa.Adhar=sc.nextLong();
						System.out.println("Are you Vaccinated..? Y/N");
						Aa.Vac=sc.next().charAt(0);
						System.out.println("");
						}
						if(Aa.Vac=='Y'||Aa.Vac=='y')
						{
							System.out.println("You are eligible to book");
							System.out.println("");
							//System.out.println("Payment = "+Aa.Price);
							System.out.println("Charges per person = "+Aa.Price+"/-");
							 sum=(Aa.Price*people);
							System.out.println("You Added = "+people+" peoples");
							
							
							System.out.println("You Have to pay = "+sum+"/-");
							double money = sc.nextInt();
							
							if(money>=sum)
							{
								System.out.println("Booking Confimed");
							}
							else
							{
								System.out.println("payment unsuccessfull3");
							}
						}
						else
						{
							System.out.println("you are not eligible");
						}
						
					}
			 }
			 else
			 {
				 
					System.out.println("you have Already choosed  Airline");
					//System.err.println(" Enter 4 to Order food");
					System.out.println();
			 }
		 }
		
	}
	
	public void CancelTickets()
	{
		if (u==null) {
			System.err.println("Login First");
			System.out.println("enter 1 to login");
			System.out.println();
		}
	else if (a==null)
		{
			
			System.out.println("First Select Airlines");
			System.err.println(" Enter 2 to Book");
			System.out.println();
		}
	else
	{
		a=null;

		System.out.println("Ticket Cancelled");
		System.out.println("Money will be refunded");
	}
	}
	
	public void DisplayTickets()
	{
		if (u==null) 
		{
			System.out.println("first login");
			System.out.println("");
		}
		else
		{
			if(a==null) 
			{
		
			System.out.println("first select Airlines");
			System.out.println("");
			}
			else if(a instanceof Indigo)
			{
				Indigo i2=(Indigo)a;
				 //Airlines a = new Airlines();
				 
			
				System.out.println("----Details-------------");
				System.out.println("1."+i2.Name);
				System.out.println("2."+i2.Age);
				System.out.println("3."+i2.Gender);
				System.out.println("4."+i2.MobNo);
				System.out.println("5."+i2.Emailid);
				System.out.println("6."+i2.Adhar);
				System.out.println("7."+i2.Vac);
				//System.out.println("1."+i.Price);
				System.out.println("7. "+ i2.from+"  ");
				System.out.println("8. "+ i2.to+"  ");
				System.out.println("9. "+ i2.date+"  ");
				
				System.out.println("Charges per person = "+i2.Price+"/-");
				System.out.println("Total paid         = "     +sum+"/-");
				
			
				}
			else if(a instanceof AirIndia)
			{
				AirIndia i2=(AirIndia)a;
				 //Airlines a = new Airlines();
				 
			
				System.out.println("----Details-------------");
				System.out.println("1."+i2.Name);
				System.out.println("2."+i2.Age);
				System.out.println("3."+i2.Gender);
				System.out.println("4."+i2.MobNo);
				System.out.println("5."+i2.Emailid);
				System.out.println("6."+i2.Adhar);
				System.out.println("7."+i2.Vac);
				//System.out.println("1."+i.Price);
				System.out.println("7. "+ i2.from+"  ");
				System.out.println("8. "+ i2.to+"  ");
				System.out.println("9. "+ i2.date+"  ");

				System.out.println("Charges per person = "+i2.Price+"/-");
				System.out.println("Total paid         = "     +sum+"/-");
			}
			else if (a instanceof AirAsia)
			{
				AirAsia i2=(AirAsia)a;
				 //Airlines a = new Airlines();
				 
			
				System.out.println("----Details-------------");
				System.out.println("1."+i2.Name);
				System.out.println("2."+i2.Age);
				System.out.println("3."+i2.Gender);
				System.out.println("4."+i2.MobNo);
				System.out.println("5."+i2.Emailid);
				System.out.println("6."+i2.Adhar);
				System.out.println("7."+i2.Vac);
				//System.out.println("1."+i.Price);
				System.out.println("7. "+ i2.from+"  ");
				System.out.println("8. "+ i2.to+"  ");
				System.out.println("9. "+ i2.date+"  ");

				System.out.println("Charges per person = "+i2.Price+"/-");
				System.out.println("Total paid         = "     +sum+"/-");
			}
		}
			
		}
	
	public static void main(String[] args) {
		MakeMyTour m=new MakeMyTour ();
    	for(;;)
    	{
    		
    	System.out.println("1.login 2.logout 3.BookTickets 4.CancelTickets 5.DisplayTickets 7.Exit ");
    	  switch(m.sc.nextInt())
    	  {
    	  
    	  case 1:
    		  m.login();
    		  break;
    	  case 2:
    		  m.logout();
    		  break;
    		  
    	  case 3 :
    		  m.BookTickets();
    		  break;
    	  case 4:
    		  m.CancelTickets();
    		  break;
    	  case 5:
    		  m.DisplayTickets();
    		  break;
    	
    	  case 7:
    		  System.out.println("application is closed");
    		  return;
	}
	

}
	}
}
	
