package com.flowerDemo;


import java.util.Scanner;



public class Employee {
	private int employeeId;
	
	private String employeeName;
	
	private double basicSalary;
	
	private double specialAllowance;
	
	private double hra;
	
	private double travelAllowance;
	
	private double tax=2500;
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	
	public double getHra() {
		return hra;
	}	

	public double getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double calculateSalary() {
		if(basicSalary<=10000) {
			this.hra=0.2*basicSalary;
			this.specialAllowance=.8*basicSalary;
		}
		else if(basicSalary>10000 && basicSalary<=20000) {
			this.hra=0.25*basicSalary;
			this.specialAllowance=.9*basicSalary;
		}
		else if(basicSalary<20000) {
			this.hra=0.3*basicSalary;
			this.specialAllowance=0.95*basicSalary;
		}
		return getBasicSalary()+hra+specialAllowance+getTravelAllowance()-getTax();
	}
	
	

 
	public static void main(String[] args) {
		

		
		Employee emp=new Employee();
		System.out.println("enter  no of employess");
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		for(int i =0;i<input;i++) {
		
		System.out.println("Enter Employee Id");
		emp.setEmployeeId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Employee Name");
		emp.setEmployeeName(sc.nextLine());
		System.out.println("Enter Basic Salary");
		emp.setBasicSalary(sc.nextFloat());
		emp.setTravelAllowance(0.2*emp.getBasicSalary());
		
		System.out.println("Employee data:\n");
		System.out.println("Employee Id:"+emp.getEmployeeId()+"\nEmployee Name :"+emp.getEmployeeName()+"\nBasic Salary:"+emp.getBasicSalary());
		System.out.println("Net Salary : "+emp.calculateSalary()+"\n");
		}
		}

}
