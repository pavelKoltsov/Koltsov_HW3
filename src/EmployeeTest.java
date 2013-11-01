import java.util.Scanner;
public class EmployeeTest {

	
	public static void main(String[] args) {
		
		Employee worker1 = new Employee ("John","Anderson",3500);
		Employee worker2 = new Employee ("Jeff","Swenson",3700);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee First Name");//Prompt	
        String name = input.next();
        worker1.setFirstName(name);
        
        System.out.println("Enter Employee Last Name ");//Prompt	
        String surName = input.next();
        worker1.setLastName(surName);
        
        System.out.println("Enter Employee Monthly Salary");//Prompt	
        double monthlyWage = input.nextInt();	
        worker1.setSalary(monthlyWage);
        
        System.out.println("Enter Employee First Name");//Prompt	
        String name1 = input.next();
        worker2.setFirstName(name1);
        
        System.out.println("Enter Employee Last Name ");//Prompt	
        String surName1 = input.next();
        worker2.setLastName(surName1);
        
        System.out.println("Enter Employee Monthly Salary");//Prompt	
        double monthlyWage1 = input.nextInt();	
        worker2.setSalary(monthlyWage1);
        
        
        double annualWage = worker1.getSalary() * 12 ;
        double annualWage1 = worker2.getSalary() * 12 ;
        
        System.out.printf("%s %s annual salary is %.2f,\n",
        		worker1.getFirstName(), worker1.getLastName(),annualWage);
        System.out.printf("%s %s annual salary is %.2f\n",
        		worker2.getFirstName(),worker2.getLastName(),annualWage1);
        
        
        double annualWageAfterRaise = annualWage + annualWage/10;
        double annualWageAfterRaise1 = annualWage1 + annualWage1/10;
        
        System.out.printf("%s %s annual salary after raise is %.2f,\n",
        		worker1.getFirstName(), worker1.getLastName(),annualWageAfterRaise);
        System.out.printf("%s %s annual salary after raise is %.2f",
        		worker2.getFirstName(),worker2.getLastName(),annualWageAfterRaise1);
	}

}//End of Program
