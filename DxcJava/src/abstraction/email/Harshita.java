package abstraction.email;

public class Harshita {

	private String dob; //nobody can access this variable except for the methods in this class

	protected int height = 6;
	private String getDob() {  //getter = tap
		return dob;
	}

	public void setDob(String dob) { //setter = cap
		this.dob = dob;
		height = 7;
	}

	public int getAge() {
		if (dob.isBlank()) {
			return 18;
		}
		return 0;
	}






}
