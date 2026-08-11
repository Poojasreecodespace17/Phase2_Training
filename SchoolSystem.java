import java.util.*;

class Student{
	int rollNo;
	String name;
	int age;
	String gender;
	void setValues(int rollNo,String name,int age,String gender) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	void getValues() {
		System.out.printf("RollNo: %d \n"+"Name :%s\n"+"Age: %d\n"+"Gender: %s",this.rollNo,this.name,this.age,this.gender);
	}
}
public class SchoolSystem {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setValues(1149,"Pooja Sree", 19, "Female");
		s1.getValues();

	}

}
