package lab.strudent.control;

import lab.student.entity.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student("김민수", "컴퓨터공학", "3학년");
		student.printInfo();
		
		System.out.println("5학년으로 변경");
        student.setGrade(5);  
	}
}
