package atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	
	Scanner sc=new Scanner(System.in);
	DecimalFormat decimalFormat=new DecimalFormat("#,##0.00");
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public double calculateCheckingWithdraw(double amount) {
		
		checkingBalance=checkingBalance-amount;
		return checkingBalance;
		
	}
	
  public double calculateSavingWithdraw(double amount) {
		
		savingBalance=savingBalance-amount;
		return savingBalance;
		
	}
	
  public double calculateCheckingDeposit(double amount) {
		
		checkingBalance=checkingBalance+amount;
		return checkingBalance;
		
	}
	
    public double calculateSavingDeposit(double amount) {
		
		savingBalance=savingBalance+amount;
		return savingBalance;
		
	}
    
    public void getCheckingWithDrawInput() {
    	System.out.println("checking Account Balance : "+decimalFormat.format(checkingBalance));
	    System.out.println("Amount you want to withdraw from checking Account :");
	    double amount=sc.nextDouble();
	    
	    if (amount > checkingBalance) {
            System.out.println("Insufficient funds! Balance can't be negative.\n");
        } else {
            calculateCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: " + decimalFormat.format(checkingBalance) + "\n");
        }
    }

	
    
    public void getSavingWithDrawInput() {
    	System.out.println("checking Account Balance : "+decimalFormat.format(savingBalance));
	    System.out.println("Amount you want to withdraw from checking Account :");
	    double amount=sc.nextDouble();
	    
	    if (amount > savingBalance) {
            System.out.println("Insufficient funds! Balance can't be negative.\n");
        } else {
            calculateSavingWithdraw(amount);
            System.out.println("New Saving Account balance: " + decimalFormat.format(savingBalance) + "\n");
        }
	}
    
    public void getCheckingDepositInput() {
    	System.out.println("checking Account Balance : "+decimalFormat.format(checkingBalance));
	    System.out.println("Amount you want to withdraw from checking Account :");
	    double amount=sc.nextDouble();
	    

        calculateCheckingDeposit(amount);
        System.out.println("New Checking Account balance: " + decimalFormat.format(checkingBalance) + "\n");
	}
    
    
    public void getSavingDeposit() {
    	System.out.println("checking Account Balance : "+decimalFormat.format(savingBalance));
	    System.out.println("Amount you want to saving from checking Account :");
	    double amount=sc.nextDouble();
	    
        calculateSavingDeposit(amount);
        System.out.println("New Saving Account balance: " + decimalFormat.format(savingBalance) + "\n");
	   
	}
    
    
		
		

	
}
