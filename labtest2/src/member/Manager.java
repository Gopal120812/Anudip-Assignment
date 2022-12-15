package member;

public class Manager extends Member {
	//data member
	private String department;

	Manager(String name,int age, String phoneNo, Address address, int salary,String department) {
		super(name,age, phoneNo, address, salary);//using super constructor to set the value from parent class
		this.department=department;
	
	}
	
	public void print()// print method to print the values
	{
		
		System.out.println("Name :"+getName());
		System.out.println("age:"+getAge());
		System.out.println("Phone Number :"+getPhoneNo());
		System.out.println("Address :"+getAddress());
		super.printsalary();
		System.out.println("Department :"+department);
	}

}
