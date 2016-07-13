package ar.com.summa.model;

public class Employee {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return  "Id:"+id+"\n"+
				"First Name: "+firstName+"\n"+
				"Last Name: "+lastName+"\n"+
				"Age : "+age+"\n";
	}
}
