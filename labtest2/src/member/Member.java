package member;

public class Member {
	// creating data members
	private String name;
	private int age;
	private String phoneNo;
	private Address address;
	private int salary;
	
	Member(String name,int age,String phoneNo,Address address,int salary) //parameterized constructor 
	{
		// setting the values of each data members 
		this.setName(name);
		this.setAge(age);
		this.setPhoneNo(phoneNo);
		this.setAddress(address);
		this.salary=salary;
	}
	
	public void printsalary() //creating method to print the salary
	{
		System.out.println("salary:"+salary);
		
	}
	//creating the getmethod so that they can be used in the child classes
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}


