package lab.strudent.control;

import lab.student.entity.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student("��μ�", "��ǻ�Ͱ���", "3�г�");
		student.printInfo();
		
		System.out.println("5�г����� ����");
        student.setGrade(5);  
	}
}
