package t5_application;

public class StudentVO { // Value Object V.O 필드를 관리하는 객체
	private int no;
	String name;
	int age;
	boolean gender;
	String job;

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setNo(int no) {
		this.no = no;
	}

}
//[DTO VO] Data Transfer Object  데이터를 담아주는 객체
//DTO = VO
//set -> setter 저장
//get -> getter 읽기