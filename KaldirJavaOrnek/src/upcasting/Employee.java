package upcasting;

public class Employee {
	int no;
	String name;
	int year;
	String department;
	
	
	public static final int BASE_SALARY = 500;
	
	public Employee() {
		
	}
	public Employee(int no, String name, int year, String department) {
		super();
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
		
	}
	public Employee(int no, String name, int year){
		this.no = no;
		this.name = name;
		this.year = year;
	}
	
	public void work() {
		System.out.println("Employee is working!");
	}
	public double calculateSalary() {
		return year*BASE_SALARY;
		
	}
	
	public void printInfo() {
		
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", year=" + year + ", department=" + department + "]";
	}
	

}
