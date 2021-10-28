package generics;

public class Account<E extends Number> {
	
	E obj;

	public E getObj() {
		return obj;
	}

	public void setObj(E obj) {
		this.obj = obj;
	}
	
	
	

}
