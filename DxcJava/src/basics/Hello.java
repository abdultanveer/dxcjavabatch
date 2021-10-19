package basics;

public class Hello {
	//age is an instance[box] variable -- partition
	int age = 20;
	
	public static String COLLEGE = "mit";
	
	
	public static void main(String[] args) {
		System.out.println("hello world");
	}
	
	int add() {
		//sName is a local variable -- within a function
		String sName = "abdul";
		return 18;
	}
}
