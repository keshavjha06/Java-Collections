package collectionsjava;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashset,treeset,linkedhashset implements set interface
		//does not accept duplicated values
		//There is no guarantee that elements are stored in sequential order.random order it is stored
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("India");
		hs.add("uk");
		hs.add("Usa");
		hs.add("Usa");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		//System.out.println(hs.remove("uk"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
	   // System.out.println(i.next());//i.next goes down to the next index from top



	}

}
