package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Tom");
		studentList.add("steve");
		studentList.add("Keshav");
		studentList.add("lisa");
		
		//typical for loop;
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("------------");
		//for each loop
		for(String i : studentList) {
			System.out.println(i);
		}
		
		System.out.println("------------");

		//JDK 8 - streams with lambda:
		
		studentList.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("------------");

		//iterator
		Iterator<String> it = studentList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	
	}

}
