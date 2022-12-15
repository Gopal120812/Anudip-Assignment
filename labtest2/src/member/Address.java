package member;

public class Address {
	//data members
	int hno;
	String area;
	String city;
	
	Address(int hno,String area,String city) //parametrized constructor
	{
		this.hno=hno;
		this.area=area;
		this.city=city;
	}

	@Override // creating to string method
	public String toString() {
		return "Address [hno=" + hno + ", area=" + area + ", city=" + city + "]";
	}


}
