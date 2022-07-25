package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

    public static void main(String[] args) {
        // 1.sort and then equals

        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2));// false

        Collections.sort(l3);
        System.out.println(l1.equals(l3));// true

        // 2.compare two list - find out the additional elements:

        ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

        ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

//		l4.removeAll(l5);
//		System.out.println(l4);//F

        //3. find out the missing elements:

        l5.removeAll(l4);//l5 removes all elements from l4
        System.out.println(l5);

        //4.find out the commone elements:

        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA", "PYTHON", "RUBY", "C#", "JS"));

        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA", "PYTHON", "RUBY", "C#", "PHP"));

        lang1.retainAll(lang2);//retainAll gives common elements

        System.out.println(lang1);


    }

}
