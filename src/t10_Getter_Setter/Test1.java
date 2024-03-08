package t10_Getter_Setter;

public class Test1 {
	private String name = "홍길동";
	private int age;
	private boolean gender;    //데이터에서 사용할거
	private String address;
	
	private String job; // 자바에서 사용할거
	
	private String sex; 
	
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean isGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age >= 20) this.age = age;
		//else this.age = 0;
		else System.out.println("미성년자는 가입할 수 없습니다.");
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSex() {
		if(gender)return "남자";
		else return "여자";
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
