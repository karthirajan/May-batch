package org.cts;

public class Employee {

	public static Employee emp;

	private Employee() {
		// TODO Auto-generated constructor stub
	}
	public static Employee getInstance() {
		if(emp==null) {
				emp=new Employee();
		}
	System.out.println(emp);
	return emp;	
	}
	
	public void empId() {
		System.out.println("emp id is 1234567");
	}
	
	public void empName() {
		System.out.println("emp name is nisha");
	}
	public static void main(String[] args) {
 Employee e=getInstance();
 e.empId();
 e.empName();
	}
}
