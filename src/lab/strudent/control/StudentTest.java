package lab.student.control;

import lab.student.entity.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("20250101", "��μ�", "��ǻ�Ͱ���", 3);
        s1.printInfo();

        // ��ȿ���� ���� �г� ����
        s1.setGrade(5);  // ���� �޽��� ���
    }
}
