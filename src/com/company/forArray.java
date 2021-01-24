package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class forArray {
    //private int[] arr;
    private ArrayList<Integer> arr = new ArrayList<Integer>();
    private int size = 0;

    forArray(ArrayList<Integer> arr, int s)
    {
        this.arr = arr;
        this.size = s;
    }

    public ArrayList<Integer> init() {
        Random rnd = new Random();
        for(int i = 0; i < size; i++)
            arr.add(rnd.nextInt()% 10);
        return arr;
    }

    public ArrayList<Integer> init(int num) { //заполнение одинаковыми числами
        for(int i = 0; i < size; i++)
            arr.add(num);
        return arr;
    }

    public void show(){
        System.out.print("Array: ");
        for(int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
        System.out.println();
    }

    public int size(){
        return arr.size();
    }

    public void add(int num){ //to end pos
        arr.add(num);
    }
    public void add(int pos, int num){ // to pos
        arr.add(pos, num);
    }

    public void del(int pos){
        arr.remove(pos);
    }

    public void increase(){
        ArrayList<Integer> tmp = (ArrayList<Integer>) arr.clone();
        Collections.sort(tmp);
        System.out.println("Массив по возрастанию: ");
        for(int i = 0; i < tmp.size(); i++)
            System.out.print(tmp.get(i) + " ");

        System.out.println();

    }

    public void decrease(){
        ArrayList<Integer> tmp = (ArrayList<Integer>) arr.clone();
        Collections.sort(tmp, Collections.reverseOrder());
        System.out.println("Массив по убыванию: ");
        for(int i = 0; i < tmp.size(); i++)
            System.out.print(tmp.get(i) + " ");

        System.out.println();

    }

    public void min(){
        System.out.println("Min: " + Collections.min(arr));
    }

    public void max(){
        System.out.println("Max: " + Collections.max(arr));
    }

}
