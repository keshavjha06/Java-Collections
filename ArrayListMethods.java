package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
//can accept duplicate values - ArrayList,LinkedList,Vector
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Js");
		a.add("java");
		a.add("python");
		a.add("Php");
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Testing");
		ar.add("DevOps");
		
		//a.addAll(ar);
//		System.out.println(a);
//		
//		a.addAll(2,ar);
//
//		System.out.println(a);
//		
//		a.clear();
//		System.out.println(a);
		
		ArrayList <String> cloneList = (ArrayList<String>)a.clone();
		System.out.println(cloneList);
		
		System.out.println(a.contains("python"));
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("java")>0);

		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Keshav","Tom","Keshav","Steve","Lisa","Keshav"));
		System.out.println(list1);
		int i = list1.lastIndexOf("Keshav");
		System.out.println(i);
		
		list1.remove(1);
		System.out.println(list1);
		
		list1.remove("Lisa");
		System.out.println(list1);
		
		ArrayList <Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		numbers.removeIf(num -> num%2==0);
//		System.out.println(numbers);
		
		numbers.removeIf(num -> num%2!=0);
		System.out.println(numbers);
		
		
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Keshav","Tom","Peter","Steve","Lisa","Tom"));
		
		System.out.println(namesList);
		
		namesList.retainAll(Collections.singleton("Tom"));
		//System.out.println(namesList);
		
		ArrayList <Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		
		ArrayList <Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 6));
		System.out.println(subList);


		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Keshav","Tom","Peter","Steve","Lisa","Robert"));
		
		Object arr[] = newList.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o : arr)
		{
			System.out.println((String)o);
		}

		
		



		
	}

}
