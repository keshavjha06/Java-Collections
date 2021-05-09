package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
//can accept duplicate values - ArrayList,LinkedList,Vector
	public static void main(String[] args) {
		
		//default class in java
		//dynamic array
		
		int i[] = new int[4];
		
		i[0] = 100;
		//i[4] = 200;//IndexOutOfBoundsException
		System.out.println(i[0]);
		System.out.println(i[2]);
		
		//default generics:
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(300);//0th index
		ar.add(100); //1st index
		ar.add("testing");//2
		ar.add('t');//3
		ar.add(true);//4
		ar.add(12.33);//5
		System.out.println(ar);
		System.out.println(ar.get(2));
		//System.out.println(ar.get(6)); ArrayIndexOutOfBounds
		//System.out.println(ar.get(-1)); -ve indexing not allowed in java
		System.out.println(ar.indexOf(300));
		System.out.println(ar.size());
		System.out.println("LI = "+ 0);
		System.out.println("HI = " + (ar.size()-1));
		
		ar.add(400);//6
		ar.add(500);//7
		System.out.println(ar.size());
		
		//list with other collection:
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		System.out.println(numbers);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("java","python", "python"));
		
		System.out.println(names);
		System.out.println(names.size());

		
		
		
	}

}
