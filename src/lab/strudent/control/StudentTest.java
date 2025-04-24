package lab.strudent.control;

import lab.student.entity.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("20250101", "김민수", "컴퓨터공학", 3);
        s1.printInfo();

        // 유효하지 않은 학년 설정
        s1.setGrade(5);  // 오류 메시지 출력
    }
}
