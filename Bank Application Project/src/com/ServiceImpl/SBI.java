package com.ServiceImpl;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JApplet;

import com.Model.Account;
import com.Service.RBI;

public class SBI  implements RBI {

	Account ac = new Account();
	Scanner sc = new Scanner(System.in);

	
	
	@Override
	public void creatAccount() {

		System.out.println("Creat Password-");
		ac.setPassword(sc.next());
		
		System.out.println("Enter AccountHolder name-");
		ac.setAccountHolder(sc.next() + sc.nextLine());

		System.out.println("Enter Address-");
		ac.setAddress(sc.next() + sc.nextLine());

		System.out.println("Enter Mobile no-");
		
		
		
		boolean d=true;
		while(d)
		{
			long x=sc.nextLong();
		if(x>=1111111111l && x<=9999999999l)
		{
			ac.setMobileno(x);
			System.out.println("+91 "+x );
			d=false;

		}
		else
		{
			System.out.println("!!!!!Enter Valid mobile no!!!!!");
		}
		}
		

		System.out.println("Enter Adhar no-");
		ac.setAdharno(sc.nextLong());

		System.out.println("Enter pan no-");
		ac.setPanno(sc.next());

		System.out.println("Select Gender-");
		
		
		boolean c=true;
		while(c)
		{
		System.out.println("1 for Male");
		System.out.println("2 for female");
		System.out.println("3 for Other");
		
		switch (sc.nextInt()) {
		case 1:
			System.out.println("***Male*** \n");
			ac.setGender("Male");
			c=false;
			break;
			
		case 2:
			System.out.println("***Female*** \n");
			ac.setGender("Female");
			c=false;
			break;
		case 3:
			System.out.println("***Other*** \n");
			ac.setGender("Other");
			c=false;
			break;

		default:
			System.out.println("!!!Please choose valid option!!! \n");
			break;
		}
		
		}

		
		System.out.println("Enter Amount-");
		ac.setBalance(sc.nextDouble());

		System.out.println("\n ");
	}

	
	@Override
	public void generateAccountNo() {
		
		if(ac.getAccountHolder()!=null ) 
		{
		
		System.out.println("Your Account NO is- "+"SBIN"+(100000000000l+(int)(new Random().nextDouble()*999999999999l)));
		}
		else
		{
			System.out.println("!!!!Create Accoount First...!!!! \n");
		}
	}
	
	 

	@Override
	public void viewAccountDetails() {

		System.out.println("Enter your Password= ");
		String l = sc.next();

		if (l.equals(ac.getPassword())) {
			System.out.println("Password=  " + ac.getPassword());

			System.out.println("Account Holder=  " + ac.getAccountHolder());

			System.out.println("Address=  " + ac.getAddress());

			System.out.println("Mobile no=  "+"+91" +  ac.getMobileno() );//ac.getMobileno());

			System.out.println("Adhar no=  " + ac.getAdharno());

			System.out.println("Pan no= " + ac.getPanno());

			System.out.println("Gender=  " + ac.getGender());

			System.out.println("Acoount Balance=  "+" Rs " + ac.getBalance());

		} else {
			System.out.println("!!!!!! Wrong Password !!!!! \n");
		}
	} 

	
	
	@Override
	public void withdrawlMoney() {
		System.out.println("Enter Ammount= ");
		double amt = sc.nextDouble();
		
		if (amt != 0 && amt <= ac.getBalance()) 
		{
			ac.setBalance(ac.getBalance() - amt);
			System.out.println("Rs."+amt + " debited from your Account Succesfully \n");
			System.out.println("*****Your Current Balance is "+ " Rs. " + ac.getBalance() );
		}
		
		else 
		{
			System.out.println("!!!!!Insufficient Balance!!!!!! \n");
		}
	}

	
	
	@Override
	public void depositMoney() {

		
		if (ac.getAccountHolder()!=null ) 
		{
			System.out.println("Enter Ammount= ");
			double amt1 = sc.nextDouble();
			ac.setBalance(ac.getBalance() + amt1);
			System.out.println(amt1 + " -Rs Creadited to your Account Succesfully \n");
			System.out.println("****Your Current Balance is "+ "Rs " + ac.getBalance() );
		} 
		else 
		{
			System.out.println("!!!!Create Accoount First...!!!! \n");
		}
	}

	
	
	@Override
	public void updateDetails() {

		boolean flag = true;
		while (flag) {
			System.out.println("1: Update Name");
			System.out.println("2: Update Mobile no ");
			System.out.println("3: Update Address");
			System.out.println("4: Finish Updating");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter new Name-");
				ac.setAccountHolder(sc.next() + sc.nextLine());
				System.out.println("***Name Updated***");
				break;

			case 2:
				System.out.println("Enter new mobile no-");
				ac.setMobileno(sc.nextLong());
				System.out.println("***Mobile no Updated***");
				break;

			case 3:
				System.out.println("Enter new Address");
				ac.setAddress(sc.next() + sc.nextLine());
				System.out.println("****Address updated****");
				break;

			case 4:
				System.out.println("*****Details Updated*****");
				flag = false;
				break;
			default:
				System.out.println("!!!!!Wrong Input!!!!!!! \n");
				break;
			}
		}
	}

	
	
	@Override
	public void viewBalance() {
		System.out.println("Enter Password-");
		String l2=sc.next();
		
		if(l2.equals(ac.getPassword()))
		{

		System.out.println("****Your curent Balance is=  "+ "Rs " + ac.getBalance() );
		System.out.println(" ");
		}
		else
		{
			System.out.println("!!!!Wrong Password!!!!\n");
		}
	}

}
