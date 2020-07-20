package com.employeeproducer.employeeproducer;

public class Employee {

	private String empName;
	private String empId;
	public String getEmpName() {
		return empName;
	}
	public Employee(String empName, String empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
}
