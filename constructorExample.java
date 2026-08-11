import java.util.*;
class Emp{
	int empId;
	String empName;
	String gender;
	Emp(){
	   System.out.println("Employee object is created successfully!");
	 }
	Emp(int empId,String empName,String gender){
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
	}
	void getEmployeeDetails() {
		System.out.println("Employee id: "+empId+" \n"+"Employee Name: "+empName+" \n"+"Gender: "+gender);
	}
}
public class constructorExample {

	public static void main(String[] args) {
		Emp e1 = new Emp(101,"John","Male");
		e1.getEmployeeDetails();
		Emp e2 = new Emp();
		e2.getEmployeeDetails();
	}

}
