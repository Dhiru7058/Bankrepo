package Admin;

import java.util.Scanner;

import com.Service.RBI;
import com.ServiceImpl.SBI;

public class Test {

	public static void main(String[] args) {

		System.out.println("sachin added");
		System.out.println("sachin added second line");

	System.out.println("Hello CJC");

		Scanner sc = new Scanner(System.in);

		RBI sbi = new SBI();

		boolean b = true;

		while (b) {

			System.out.println("***********Welcome to SBI**********");
			System.out.println("1: Enter 1 for Create Account");
			System.out.println("2: Enter 2 for view your Acoount no");
			System.out.println("3: Enter 3 for View Account details");
			System.out.println("4: Enter 4 for Withdrawal money");
			System.out.println("5: Enter 5 for Deposite money");
			System.out.println("6: Enter 6 for Update deatails");
			System.out.println("7: Enter 7 for View balance");
			System.out.println("8: Enter 8 for Exit");

			switch (sc.nextInt()) {
			case 1:
				sbi.creatAccount();
				System.out.println("***************Your Account Created Succesfully***************");
				break;

			case 2:
				sbi.generateAccountNo();
				break;

			case 3:
				System.out.println("Account Details");
				sbi.viewAccountDetails();
				break;

			case 4:
				sbi.withdrawlMoney();
				break;

			case 5:
				sbi.depositMoney();
				break;

			case 6:
				sbi.updateDetails();
				System.out.println("Details Updated");
				break;

			case 7:

				sbi.viewBalance();
				break;

			case 8:

				System.out.println("**********Thank you for Visiting Us********");
				b = false;
				break;

			default:

				System.out.println("Enter valid Option");
				break;
			}

		}

	}

}
