package ArrayListConcepts;

import java.util.ArrayList;

public class VirtualCapacity {

    public static void main(String[] args) {

        ArrayList<Object> ar = new ArrayList<>(20);

        System.out.println(ar.size());//Physical capacity(Pc) is 0

        ar.add(100);

        System.out.println(ar.size());//Pc = 1

        ar.add(200);
        ar.add(300);
        ar.add(400);
        System.out.println(ar.size());//Pc = 4


    }

}
