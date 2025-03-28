package atm;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Details extends Account {
	
	Scanner sc=new Scanner(System.in);
	DecimalFormat decimalFormat=new DecimalFormat("#,##0.00");
	
	HashMap<Integer, Integer> hashMap=new HashMap<Integer, Integer>();
	
	int selection;
	 
	
	public void getLogin() {
		
		int x=1;
		
		do {
			
			try {
				
		      hashMap.put(261004, 1212);
		      hashMap.put(123456, 2323);
		      
		      System.out.println("Hey buddy Welcome to ATM");
		      
		      System.out.println("Enter your Customer Number :");
		      setCustomerNumber(sc.nextInt());
		      
		      System.out.println("Enter your Pin Number :");
              setPinNumber(sc.nextInt());
		      
				
			} catch (Exception e) {
				
				System.out.println("\n"+ "Invalid Characters .Enter Only Numbers. "+"\n");
			    x=2;
			}
			
			
			for(java.util.Map.Entry<Integer, Integer> entry:hashMap.entrySet())
			{
				if(entry.getKey()==getCustomerNumber()&& entry.getValue()==getPinNumber())
				{
				 getAccountType();	
				}
			
					
				
			}
			
			
			System.out.println("\n"+"Wrong Customer Number or PinNumber ."+"\n");
			
			
		} while (x==1); 
		
	}
	
	
	public void getAccountType() {
System.out.println("Select what  you want to Access :");
System.out.println("Type 1 - Checking Account");
System.out.println("Type 2 - Saving Account");
System.out.println("Type 3 - Exit");
System.out.println("choice :");
  
  
  selection = sc.nextInt();

  switch(selection)
  {
  
  case 1:
	 getChecking();
	  break;
	  
  case 2:
	  getSaving();
	  break;
	  
  case 3:
	  System.out.println("\n "+"Thank u for using this ATM, bye"+" \n");
	  break;
	  
	  default:
	  System.out.println("\n"+" Invalid Choice"+" \n");
	  getAccountType();
 
  }

 	
	}
	
public void getChecking() {
	
	System.out.println("Checking Account:");
	System.out.println("Type 1-view Balance");
	System.out.println("Type 2-Withdraw Funds");
	System.out.println("Type 3-Deposit Funds");

	System.out.println("Type 4-Exit");

	System.out.println("Choice :");
	
	 selection=sc.nextInt();
	
	switch(selection)
	{
	case 1:
		System.out.println("Checking Account Balance :"+decimalFormat.format(getCheckingBalance()));
       getAccountType();
		break;
	
	case 2:
	    getCheckingWithDrawInput();
	    getAccountType();
		break;
	case 3:
		getCheckingDepositInput();
		getAccountType();
		break;
		
	case 4:
		System.out.println("\n "+"Thank u for using this ATM, bye"+" \n");
		break;
		
		default:
		System.out.println("\n"+"Invalid choice."+"\n");
		getChecking();
	}
}
	
public void getSaving() {
	
	System.out.println("Checking Account:");
	System.out.println("Type 1-view Balance");
	System.out.println("Type 2-Withdraw Funds");
	System.out.println("Type 3-Deposit Funds");

	System.out.println("Type 4-Exit");

	System.out.println("Choice :");
	
	 selection=sc.nextInt();
	
	switch(selection)
	{
	case 1:
		System.out.println("Checking Account Balance :"+decimalFormat.format(getSavingBalance()));
        getAccountType();
		break;
	
	case 2:
	    getSavingWithDrawInput();
	    getAccountType();
		break;
	case 3:
		getSavingDeposit();
		getAccountType();
		break;
		
	case 4:
		System.out.println("\n "+"Thank u for using this ATM, bye"+" \n");
		break;
		
		default:
		System.out.println("\n"+"Invalid choice."+"\n");
		getSaving();
	}
}



}
