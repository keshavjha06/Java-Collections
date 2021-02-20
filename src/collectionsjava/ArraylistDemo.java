package collectionsjava;

import java.util.ArrayList;

public class ArraylistDemo {
//can accept duplicate values - ArrayList,LinkedList,Vector
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Keshav");
		a.add("java");
		a.add("java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
//		a.remove(1);
//		a.remove("java");
//		System.out.println(a);
		//a.get(2);
		System.out.println(a.get(2));
		//testing is present or not
		System.out.println(a.contains("testing"));
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("Keshav"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());


		
		

	}

}
