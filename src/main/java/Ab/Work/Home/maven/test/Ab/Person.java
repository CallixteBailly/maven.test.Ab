package Ab.Work.Home.maven.test.Ab;

public class Person {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private double numberPhone;
	
	private int size;
	
	private String origin;

	public Person(int id, String firstName, String lastName, double numberPhone , int size, String origin)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberPhone = numberPhone;
		this.size = size;
		this.origin = origin;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public double getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(double numberPhone) {
		this.numberPhone = numberPhone;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}


}
