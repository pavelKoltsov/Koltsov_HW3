import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		
		Date myDate= new Date (9, 20, 2012);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input month");//Prompt
		int month1 = input.nextInt();
		myDate.setMonth(month1);
		
		System.out.println("Please input day");//Prompt
		int day1 = input.nextInt();
		myDate.setDay(day1);
		
		System.out.println("Please input year");//Prompt
		int year1 = input.nextInt();
		myDate.setYear(year1);
		
		System.out.printf("The date to display is %d / %d / %d", myDate.getMonth(),
				myDate.getDay(),myDate.getYear());
	}

}
