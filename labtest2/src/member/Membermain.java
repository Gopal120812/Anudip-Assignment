package member;
public class Membermain {

	public static void main(String[] args) {
		
		Address a1 = new Address(193,"Loni","Ghaziabad"); //object of address 
		Address a2 = new Address(134,"Sadar","New Delhi");
		Employee e = new Employee("Gopal",20,"7063247727",a1,10000,"coding"); //object of employee
		Manager m= new Manager("Deepak",22,"8447999476",a2,20000,"HR"); //object of manager
		
		e.print(); //calling print method of employee class through its object
		m.print(); //calling print method of manager class through its object

	}

}
