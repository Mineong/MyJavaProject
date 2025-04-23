package lab.student.entity;

public class Student {
	private String studentId;
	private String name;
	private String major;
	private int grade;
	
	public void student(String studentId, String name, String major, int grade) {
		this.studentId = studentId;
        this.name = name;
        this.major = major;
        setGrade(grade); // setGrade로 유효성 검사
	}
	
	//getter
	public String getStudentId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public int getGrade() {
		return grade;
	}
	
	//	setter
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setGrade(int grade) {
		if (grade >= 1 && grade <= 4) {
			this.grade = grade;
		}
		else {
			System.out.println("학년은 1~4 사이여야 합니다");
		}	
	}
	
	public void printInfo() {
        System.out.println(name + " / " + major + " / " + grade + "학년");
    }
}
