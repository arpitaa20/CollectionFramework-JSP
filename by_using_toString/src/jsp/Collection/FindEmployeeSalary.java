package jsp.Collection;

/* QUESTION :
 * 1.create a class Employee.
 * 2.define properties name, company, salary
 * 3.Override toString()
 * 4.create minimum 2 object print the details
 * 5.within toString() print only salary */

public class FindEmployeeSalary {
	private String name;
	private String company;
	private double salary;
	
	FindEmployeeSalary(String name, String company, double salary){
		this.name=name;
		this.company=company;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return salary+" ";
		
	}
	
	public static void main(String[] args) {
		FindEmployeeSalary e1 = new FindEmployeeSalary("Arpita", "Amazon", 60000.00);
		FindEmployeeSalary e2 = new FindEmployeeSalary("Subhamay", "CGI", 70000.00);
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
