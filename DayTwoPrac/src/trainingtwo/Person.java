package trainingtwo;

public class Person {
	private long pid;
	private String firstName;
	private int age;
	public Person(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.pid= generatePid();
	}
	public Person() {
		super();
		this.pid= generatePid();
		
	}
	private long generatePid() {
		long myid = (long)(Math.round(Math.random()*1000));
		
		return myid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPid() {
		return pid;
	}
	
	
}
