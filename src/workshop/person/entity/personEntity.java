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
		super(); // �⺻ ������ �θ� -> �ڵ� ����
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.phone = phone;
	}
	
}
