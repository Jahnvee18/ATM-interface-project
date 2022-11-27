import java.io.*;
import java.util.Scanner;
public class Bank {

	public static void displayBalance(int balance)
	{
		System.out.println("Current Balance : " + balance);
		System.out.println();
	}

	public static int amountWithdrawing(int balance,
							int withdrawAmount)
	{
		System.out.println("Withdrawn Operation:");
		System.out.println("Withdrawing Amount : "
						+ withdrawAmount);
		if (balance >= withdrawAmount) {
			balance = balance - withdrawAmount;
			System.out.println(
				"Please collect your cash , and your card");
			displayBalance(balance);
		}
		else {
			System.out.println("Sorry! Insufficient cash");
			System.out.println();
		}
		return balance;
	}

	public static int amountDepositing(int balance,
									int depositAmount)
	{
		System.out.println("Deposit Operation:");
		System.out.println("Depositing Amount : "
						+ depositAmount);
		balance = balance + depositAmount;
		System.out.println(
			 "Congratulations!Your Money has been successfully deposited");
		displayBalance(balance);
		return balance;
	}
	



    public static int amountTransfer(int balance , int transferAmount)
    {
    
    System.out.println("Transfer Operation: ");
    System.out.println("Transferring Amount: "+ transferAmount);

    if(balance > transferAmount)
    {    
        System.out.println("Your amount has been transferred in bulbul's account");
        balance = balance-transferAmount;
        System.out.println("Money left: "+ balance);
    }
    else if(balance < transferAmount)
    {
       System.out.println("You have insufficient amount: "+ balance);
    }
    return balance;

    }
      

	public static void main(String args[])
	{
		int balance = 25000;
		int withdrawAmount = 3000;
		int depositAmount = 8000;
           int transferAmount = 2000;

		displayBalance(balance);
		balance
			= amountWithdrawing(balance, withdrawAmount);
		// depositing amount
		balance = amountDepositing(balance, depositAmount);
           //transferring amount
           balance = amountTransfer(balance, transferAmount);
	}
}