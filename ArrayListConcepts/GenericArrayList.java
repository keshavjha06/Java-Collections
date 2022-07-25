package ArrayListConcepts;

import java.util.ArrayList;

public class GenericArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> marksList = new ArrayList<>();
        marksList.add(100);

        ArrayList<Double> arD = new ArrayList<>();

        arD.add(12.33);
        arD.add(100.0);
        System.out.println(arD);

        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Tom");


    }

}
