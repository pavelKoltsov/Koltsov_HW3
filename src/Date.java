
public class Date {

	private int month;
	private int day;
	private int year;

	public Date(int month1, int day1, int year1) { 
		
	month = month1;
	day = day1;
	year = year1; 
	
	 int remainder = year1 % 4;	//Will be used to validate statements for leap years
	 
	 if (month1 >= 1 && month1 <= 12)
		 month = month1;
	   else {month = 1;
	   // set default month
	   }
	 //Validates month
	 
	 if (year1 >= 1900 && year1 <= 2050)// Set year range
		 year = year1;
	   else year = 2012;// set default year
	 //Validates year
	 
	 if (( month1 == 1)|| month1 == (3) || month1 == (5)|| month1 == (7)// Do not know how to use arrays
			|| month1 == (8)|| month1 == (10)|| month1 == (12))//or any better solution in java syntax
		if ((day1 >= 1)&&(day1 <= 31))
		day = day1;
		else day = 1;//set default day
	 
	 if (( month1 ==4)|| month1 == (6) || month1 == (9)|| month1 == (11))
		// Do not know how to use arrays or any better solution in java syntax
			if ((day1 >= 1)&&(day1 <= 30))
			day = day1;
			else day = 1;//set default day
	
		 if (month1 ==2) //February non leap year
			 if (remainder != 0)
			 if ((day1 >= 1)&&(day1 <= 28)) 
				 day = day1;
				else day = 1;//set default day
	 
		 if (month1 ==2) //February leap year
			 if (remainder == 0)
			 if ((day1 >= 1)&&(day1 <= 29)) 
				 day = day1;
				else day = 1;//set default day
		 //Validates day
		 //End of constructor
	}
	
	//set and get methods
public void setMonth(int month1){
	if (month1 >= 1 && month1 <= 12)
		 month = month1;
	   else month = 1;
	// set default month
	 //Validates month
}
public int getMonth(){
	return month;
}

public void setYear(int year1){
	 if (year1 >= 1900 && year1 <= 2050)// Set year range
		 year = year1;
	   else year = 2012;// set default year
}//Validates year	
	 
public int getYear(){
	return year;		 
}	

public void setDay(int day1){
	
	 int remainder = year % 4;
	 
	 if (( month == 1)|| month == (3) || month == (5)|| month == (7)// Do not know how to use arrays
				|| month == (8)|| month == (10)|| month == (12))//or any better solution in java syntax
			if ((day1 >= 1)&&(day1 <= 31))
			day = day1;
			else day = 1;//set default day
		 
		 if (( month ==4)|| month == (6) || month == (9)|| month == (11))
			// Do not know how to use arrays or any better solution in java syntax
				if ((day1 >= 1)&&(day1 <= 30))
				day = day1;
				else day = 1;//set default day
		
			 if (month ==2) //February non leap year
				 if (remainder != 0)
				 if ((day1 >= 1)&&(day1 <= 28)) 
					 day = day1;
					else day = 1;//set default day
		 
			 if (month ==2) //February leap year
				 if (remainder == 0)
				 if ((day1 >= 1)&&(day1 <= 29)) 
					 day = day1;
					else day = 1;//set default day
} //Validates day
public int getDay()	{
return day;
}
//End of Class
}