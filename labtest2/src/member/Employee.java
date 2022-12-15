package member;

public class Employee extends Member {
	
	private String specialization;
	
	// parameterized constructor
	Employee(String name,int age,String phoneNo, Address address, int salary,String specialization) 
	{
		super(name,age, phoneNo, address, salary); //using super constructor to set the value from parent class
		this.specialization=specialization;
	}
	
	public void print() // print method to print the values
	{
		
		System.out.println("Name :"+getName());
		System.out.println("age:"+getAge());
		System.out.println("Phone Number :"+getPhoneNo());
		System.out.println("Address :"+getAddress());
		super.printsalary();
		System.out.println("Specialization :"+specialization);
	}

}
