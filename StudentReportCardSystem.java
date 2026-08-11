import java.util.*;
class StudentReportCard{
	int rollNo;
	String name;
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	float avg;
	String grade;
	StudentReportCard(int rollNo,String name,int m1,int m2,int m3,int m4,int m5){
		this.rollNo = rollNo;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}
	void getDetails() {
		System.out.println("Roll No: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Subject1 mark: "+m1);
		System.out.println("Subject2 mark: "+m2);
		System.out.println("Subject3 mark: "+m3);
		System.out.println("Subject4 mark: "+m4);
		System.out.println("Subject5 mark: "+m5);
		System.out.println("Total Average: "+calculateAverage());
		System.out.println("Grade: "+gradeCalculation());
	}
	float calculateAverage(){
		avg = (m1+m2+m3+m4+m5)/5;
		return avg;
	}
	String gradeCalculation() {
		if(avg>=90) {
			grade = "A+";
			return "A+";
		}
		else if(avg>80) {
			grade = "A";
			return "A";
		}
		else if(avg>70) {
			grade = "B+";
			return "B+";
		}
		else if(avg>60) {
			grade = "B";
			return "B";
		}
		else if(avg>=50) {
			grade = "C";
			return "C";
		}
		grade = "F";
		return "F";
	}
}
public class StudentReportCardSystem {

	public static void main(String[] args) {
		StudentReportCard s1 = new StudentReportCard(1,"John",80,90,92,85,88);
		float result = s1.calculateAverage();
		System.out.println("Total average marks: "+result);
		s1.getDetails();
		StudentReportCard s2 = new StudentReportCard(2,"Ron",89,78,96,90,82);
		s2.rollNo = 4;
		s2.getDetails();
	}

}
