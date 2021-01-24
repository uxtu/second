package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	   // forArray arr = new forArray(new int[]{1,2,3,4,5});

	   // arr.show();

        //System.out.println(arr.size());

        forArray arr = new forArray(new ArrayList<Integer>(), 5);
        arr.init();
        arr.show();
        arr.del(3);
        arr.show();
        arr.add(2);
        arr.add(0,88);
        arr.show();
        arr.increase();
        arr.decrease();
        arr.show();
        arr.min();
        arr.max();
        forArray arr2 = new forArray(new ArrayList<Integer>(), 5);
        arr2.init(9);
        arr2.show();


    }
}
