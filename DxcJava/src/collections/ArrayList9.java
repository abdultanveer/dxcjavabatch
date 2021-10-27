package collections;
import java.util.*;  
class ArrayList9{  
	public static void main(String args[]){  
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Ravi");
		//al.add(10);
		al.add("Vijay");  
		al.add("Ajay");  
		ArrayList<String> al2=new ArrayList<String>();  //generic arraylist
		al2.add("Ravi");  
		al2.add("Hanumat"); 
		al2.add("Ajay");  
		String myname = al2.get(0);

		//ArrayList<Object> al = new ArrayList<Boolean>();

		al.retainAll(al2); 

		System.out.println("iterating the elements after retaining the elements of al2");  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  