import java.util.Scanner;

public class InvoiceTest {

	
	public static void main(String[] args) {
		
		
		Invoice myInvoice = new Invoice("55555", "hard drive", 5, 170); 
		//Object declaration with a constructor
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Item Number");//Prompt	
        String number = input.next();
        myInvoice.setPartNumber(number);
        
        System.out.println("Enter Item Description");//Prompt	
        String description = input.next();
        myInvoice.setPartDescription(description);
        
        System.out.println("Enter Quantity Purchased");//Prompt	
        int quantity = input.nextInt();	
        myInvoice.setQuantityPurchased(quantity);
        
        System.out.println("Enter Price Per Item");//Prompt	
        double price = input.nextDouble();
        myInvoice.setPricePerItem(price);
        
        System.out.printf("Your total for the order of %s, %s, with a quantity of %d " +//Output
         "and a price of %.2f will be %.2f dollars",
         myInvoice.getPartNumber(),myInvoice.getPartDescription(), myInvoice.getQuantityPurchased(),
         myInvoice.getPricePerItem(), myInvoice.getInvoiceAmount() );
	}
}//End of Program
