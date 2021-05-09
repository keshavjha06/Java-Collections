package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		HashMap<String, String> capitalMap = new HashMap<String,String>();
		capitalMap.put("India","New Delhi");
		capitalMap.put("USA","Washington DC");
		capitalMap.put("UK","London");
		capitalMap.put("UK","London11");
		capitalMap.put(null,"Berlin");
		capitalMap.put(null,"LA");
		capitalMap.put("Russia",null);
		capitalMap.put("France",null);
		capitalMap.remove("France");

		//System.out.println(capitalMap);
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("Washington DC"));//null

		System.out.println(capitalMap.get("UK"));//London11
		System.out.println(capitalMap.get(null));//LA
		System.out.println(capitalMap.get("France"));//null
		
		//iterator:over the keys :by using keySet()
		
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = " + key + " value = " + value);
		}
			
			System.out.println("----------------------");

			//iterator:over the set (pair) :by using entrySet
			
			Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
			
			while(it1.hasNext()) {
				Entry<String, String> entry = it1.next();
				System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
			}
			System.out.println("----------------------");

			//iterate hashmap using java 8 for each and lambda:
			
			capitalMap.forEach((k,v) -> System.out.println("key = " + k + " and value = " + v));

		}
		
	}


