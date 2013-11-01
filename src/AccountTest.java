import java.util.Scanner;

public class AccountTest {
//Example in a book gives two objects of the same class. I left one in modified version, because
//the other one performs the same operations
	public static void main(String[] args) {
		Account myAccount = new Account(1000.00);
		System.out.printf("Your account balance: $%.2f\n", myAccount.getbalance());
	
Scanner input = new Scanner(System.in);
System.out.print("Enter withdrawal amount");//Prompt
 double withdrawal = input.nextDouble();	
 myAccount.debit(withdrawal);
 
 //Output
 System.out.printf("Your account balance: $%.2f\n", myAccount.getbalance());
	}

}
