package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[20];
        System.out.println("Array with random numbers: " + Arrays.toString(getRandomNumbers(array)));

    ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("ArrayList with random numbers: " + getRandomNumbers(arrayList));

    LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("LinkedList with random numbers: " +getRandomNumbers(linkedList));

    }


    public static int [] getRandomNumbers(int [] array){
        Random randNumbers = new Random();

        for(int i = 0; i < array.length; i++) {
            array [i] = randNumbers.nextInt(0,2);
        }
        Arrays.sort(array);

        return array;
    }


    public static ArrayList<Integer> getRandomNumbers(ArrayList<Integer> arrayList) {
        Random randNumbers = new Random();

        for(int i = 0; i < 20; i++) {
            arrayList.add(randNumbers.nextInt(0,2));
        }

        Collections.sort(arrayList);

        return arrayList;
    }


    public static LinkedList<Integer> getRandomNumbers(LinkedList<Integer> linkedList) {
        Random randNumbers = new Random();

        for(int i = 0; i < 20; i++) {
            linkedList.add(randNumbers.nextInt(0,2));
            Collections.sort(linkedList);
        }
        return linkedList;
    }
}
