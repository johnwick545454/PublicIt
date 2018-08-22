package Answer1;

public class Employee implements Addressable {
	String state;
	String city;
	int age;

	public Employee(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}

	
	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return state;
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return city;
	}

}
