
public class Account {
	
   private double balance;
   
	public Account(double initialbalance) { // Constructor
		
		if (initialbalance > 0.0)
		balance = initialbalance;
		}

 public void debit (double amount) {
	 if ( amount > balance)
		 displayMessage();
	 else
		 balance = balance - amount;
 } // Ensure that amount withdrawn does not exceed account balance
  
 public void displayMessage() {
	 System.out.println("Debit amount exceeded account balance");
	 
 }
 public double getbalance ()  {
 return balance;
 }
}
