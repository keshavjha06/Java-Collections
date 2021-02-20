package collectionsjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm= new HashMap<Integer,String> ();
		hm.put(0, "hello");
		hm.put(1, "goodbye");
		hm.put(2, "good morning");
		hm.put(3, "good evening");
		hm.put(5, null);
		System.out.println(hm.get(2));
		hm.remove(42);
		System.out.println(hm.get(42));
		Set sm= hm.entrySet();
		Iterator it= sm.iterator();
		//hashtable -pass table to set collections
		while(it.hasNext())
		{
			//System.out.println(it.next());
			Map.Entry mp=(Map.Entry)it.next();
//			mp.getKey();
//			mp.getValue();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}



		

	}

}
