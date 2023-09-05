package bank.com;

import java.util.Scanner;

public class ICICIBank {
   
	Account [] ac = new Account[2];
	Scanner sc = new Scanner(System.in);
	 Account a;
	
	public void AddAccount()
	{
		for (int i =0;i<ac.length;i++)
		{
			if (ac[i]==null)
			{
				System.out.println("enter name ");
				String name = sc.next();
				System.out.println("enter accountno. ");
				long acctno = sc.nextLong();
				System.out.println("enter pswd");
				int pswd = sc.nextInt();
				System.out.println("enter bal ");
				double bal = sc.nextDouble();
				System.out.println("enter Address ");
				String Address = sc.next();
				
				Account a1 = new Account(name,acctno,pswd,bal,Address);
				ac[i]=a1;
				System.out.println("Account is created");
				return;
				
				
			}
		}
		System.out.println("database is full ");
	}
	public void removeAccount()
	{
		
		if(ac!=null)
		{
			System.out.println("enter Account number");
			  int acctno=sc.nextInt();
			  for(int i=0;i<ac.length;i++)
			  {
				  Account a1=ac[i];
				  if(a1.acctno==acctno)
				  {
					  ac[i]=null;
					  System.out.println("account is removed");
					  return;
				  }
			  }
			  System.out.println("data not found");
			
		}
		else
		{
			System.out.println("no acc is present");
		}
		
		/*System.out.println("enter Account no.");
		int acctno = sc.nextInt();
		for (int i =0;i<ac.length;i++)
		{
			 Account a1=ac[i];
			if(ac[i]!=null)
		     {
			  
			
			      if(a1.acctno==acctno)
			      {
				        ac[i]=null;
			        	System.out.println("Account is removed");
			        	return;
			         	
			      }
			     else
			     {
				       System.out.println("account number not matched");
				       return;
				      
			     }
			}
			else
		       {
		         System.out.println("Data not found ");
		          return;
		       }
		     
		}*/
		
		
	}
	
	public void withdraw()
	{
		 if(ac!=null)
			{
		System.out.println("enter Account no.");
		int acctno = sc.nextInt();
		for (int i =0;i<ac.length;i++)
		{
			Account a1=ac[i];
			
			
			if(a1.acctno==acctno)
			{
				
				System.out.println("enter pswd");
				int pswd=sc.nextInt();
				if(a1.pswd==pswd)
				{
					System.out.println("WELCOME  "+a1.name);
					System.out.println("enter amount");
					Double a = sc.nextDouble();
					if(a<a1.bal)
					{
					
						a1.bal=a1.bal-a;
						System.out.println("please wait amount withdrawing.............");
						return;
					}					
				
					else
					{
					System.out.println("insufficient bal");
					return;
					}
				}
			      else
				{
				System.out.println("password not matched");
				return;
				}
			}
			
		}
			}
		else
		{
		System.out.println("Data not found");
		return;
		}
		}
			

		
		
	
	
	public void deposit()
	{
		if(ac!=null)
		{
		System.out.println("enter Account no.");
		int acctno = sc.nextInt();
		for (int i =0;i<ac.length;i++)
		{
			Account a1=ac[i];
			
			if(a1.acctno==acctno)
			{
				
				System.out.println("add amount");
				double amt = sc.nextDouble();
			    
				a1.bal=a1.bal+amt;
				System.out.println("amount deposited");
				
			}
		}
		}
		else
		{
		System.out.println("Data not found");
		}
		
	}
	
	public void ChangePswd()
	{  
		if(a!=null)
		{
		System.out.println("enter Account no.");
		long acctno = sc.nextInt();
		for (int i = 0;i<ac.length;i++)
		{
		System.out.println("enter pswd");
		int pswd=sc.nextInt();
		 Account a1=ac[i];

			if(a1.acctno==acctno)
			{
				
		if (a1.pswd==pswd)
		{
			System.out.println("enter new password");
			int pswd2= sc.nextInt();
			a1.pswd=pswd2;
			System.out.println("passwrod changed");
			
			
		}
		else
		{
		System.out.println("enter correct password");
		}
			}
			else
			{
				System.out.println("enter valid account");
			}
		}
		}
		else
		{
			System.out.println("data not available");
		}
		
			
		
	}
	
	public void CheckBal()
	{
        
		System.out.println("enter Account no.");
		long acctno = sc.nextInt();
		for (int i =0;i<ac.length;i++)
		{
		  if(ac[i]!=null)
	        {
				
			Account a1=ac[i];
			
			if(a1.acctno==acctno)
			{
				
				System.out.println("enter pswd");
				int pswd=sc.nextInt();
				
			        	if(a1.pswd==pswd)
				         {
				             	System.out.println("WELCOME "+a1.name);
				                 System.out.println("Balance = "+a1.bal);
				                  return;
				         }
				          else
				              {
				                System.out.println("password not matched");
				                  return;
				              }
			}
	        }
		  
			
		
				System.out.println("account is not present");
				return;
			    
	        }
		}
}
        
          
        
      