
public class Invoice {
	
	private String partNumber;
	private String partDescription;
	private int quantityPurchased;
	private double pricePerItem;
	
	public Invoice(String number, String description, int quantity, double price){ //Constructor
        
		partNumber = number ;
		partDescription = description;
		quantityPurchased = quantity;
	    pricePerItem = price;	
}//End of Constructor
	
	//Start of methods
	 public void setPartNumber(String number){
		 partNumber = number ;	
	 } 
	 public String getPartNumber(){
		 return partNumber;
	 }
	 
	 public void setPartDescription(String description){
		 partDescription = description;	
	 } 	 
	 public String getPartDescription(){
		 return partDescription;
	 }
	
	 public void setPricePerItem(double price){
		 if (price < 0.0)
				pricePerItem = 0;
		 else 
				pricePerItem = price;		 
	 }
	 public double getPricePerItem(){
		 return pricePerItem;
	 }
	 
	 public void setQuantityPurchased(int quantity)	{
		 if (quantity < 0)
			    quantityPurchased = 0;   
			else   
			    quantityPurchased = quantity;
	 }
	 public int getQuantityPurchased(){
		 return quantityPurchased;
	 }
	 public double getInvoiceAmount(){
		 double invoiceAmount = quantityPurchased * pricePerItem;
		 return invoiceAmount;
	 }
}
	//End of class


