package Encapsulation;
class EmployeePaySlip{
	int empId;
	String name;
	int age;
	String gender;
	double netSalary;
	double basicSalary;
	double grossSalary;
	double taxPaid;
	EmployeePaySlip(int empId,String name,int age,String gender,double basicSalary){
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
		grossSalary = basicSalary;
	}
	void calculateHRA() {
		double hra = basicSalary*0.50;
		grossSalary+=hra;
	}
	void calculateTA() {
		double ta = basicSalary*0.20;
		grossSalary+=ta;
	}
	void calculateNetSalary() {
		calculateHRA();
		calculateTA();
		taxPaid = grossSalary*0.30;
		netSalary = grossSalary-taxPaid;
	}
	void getDetails() {
		calculateNetSalary();
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+name);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("Gross Salary: "+grossSalary);
		System.out.println("Tax to be paid: "+taxPaid);
		System.out.println("Net Salary: "+netSalary);
	}
}
public class PaySlip {

	public static void main(String[] args) {
		EmployeePaySlip emp1 = new EmployeePaySlip(101,"John",32,"Male",90000);
		emp1.getDetails();
		

	}

}
