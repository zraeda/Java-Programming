/**********************************************

Workshop # 1

Course:<JAC444> - Semester Summer

Last Name:<Zleik>

First Name:<Raeda>

ID:<113091151>

Section:<SCD>

This assignment represents my own work in accordance with Seneca Academic Policy.

Signature R.Z

Date:<07-06-2018>

**********************************************/

import java.util.Scanner;

public class ATM {
	
	static Account[] accountArray = new Account[10];
//	Scanner input = new Scanner(System.in);
	public static void init() {
		for (int i =0; i<accountArray.length;i++) {
			accountArray[i] = new Account(i,100.00);
		}
	}
    public static int menu() {
    	int choice;
    	System.out.println("Main menu: ");
		System.out.println("1: check balance\n" + 
				"2: withdraw\r\n" + 
				"3: deposit\r\n" + 
				"4: exit\r\n" );
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter a choice:  ");
			choice = input.nextInt();
			input.nextLine();
			if (choice < 1 || choice > 4) {
				System.out.println("Please Enter number between 1 and 4!!!!  ");
			}
		}while(choice < 1 || choice > 4);

		return choice;
    }
     public static void checkBalance(int id) {
     	System.out.println("The balance is: " + accountArray[id].getBalance() );
   	 System.out.println();
 
     } 
     public static void withdraw(int id) {
 		Scanner input = new Scanner(System.in);
    	 System.out.println("Enter an amount to withdraw : ");
    	 double amount = input.nextDouble();
    	 accountArray[id].withdraw(amount);
    	 System.out.println();

     } 
     public static void deposit(int id) {
 		Scanner input = new Scanner(System.in);
    	 System.out.println("Enter an amount to deposit : "  );
    	 double amount = input.nextDouble();
    	 accountArray[id].deposit(amount);
    	 System.out.println();

     } 
    
	public static void main(String[] args) {
		int id;
		Scanner input = new Scanner(System.in);
		init();
	
		//do {
		while (true) {
		System.out.println("Enter an Id: ");
		id = input.nextInt();
		input.nextLine();
		//}while(id <0 || id > 9);
		if (id < 0 || id > 9) {
			System.out.println("Enter an Id between 0 and 9: ");
		}else {
		int choice = 0;
		do {
		    choice = menu();
	        switch (choice) {
            case 1: checkBalance(id) ;
                     break;
            case 2: withdraw(id) ;
                     break;
            case 3: deposit(id) ;
                     break;
            case 4:  System.out.println();
                     break;
     }  
		}while (choice != 4);
		}
	}
	}

}
