package workshop.person.entity;

public class personEntity {
	private String name;
	private char gender;
	private String ssn;
	private String address;
	private String phone;

	public personEntity() {

	}

	public personEntity(String name, String ssn, String address, String phone) {
		super(); // 기본 생성자 부름 -> 자동 생성
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
		char genderNum = ssn.charAt(6);
		if (genderNum == '1' || genderNum == '3') {
//			this.gender = '남';
			setGender('남');
		} else {
			setGender('여');
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
