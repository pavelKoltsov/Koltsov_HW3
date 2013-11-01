
public class Employee {
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
	

	public Employee(String name, String surName, double monthlyWage) {//Constructor
	firstName = name;
	lastName = surName;
	monthlySalary = monthlyWage;
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String surName) {
		lastName = surName;
	}
	public String getLastName(){
		return lastName;
	}
	
	public void setSalary(double monthlyWage ) {
		if (monthlyWage >= 0)
		monthlySalary = monthlyWage;
	}
	public double getSalary(){
		return monthlySalary;
	}
	
}
