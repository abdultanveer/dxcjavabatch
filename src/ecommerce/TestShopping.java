package ecommerce;

public class TestShopping {
	public static void main(String[] args) {
		
		Customer customerAbdul = new Customer();
		customerAbdul.walkin();
		Security maxSecurity = new Security();
		maxSecurity.scan(customerAbdul);
	}

}
