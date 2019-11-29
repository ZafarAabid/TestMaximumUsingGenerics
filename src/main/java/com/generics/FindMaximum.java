package com.generics;

import java.util.Arrays;

public class FindMaximum<E extends Comparable> {

    E[] valueArr;

    public FindMaximum(){}
    public FindMaximum(E... val) {
        System.out.println();
        valueArr=(E[]) new Comparable[val.length];
        E[] array=(E[]) new Comparable[val.length];
        int i=0;
        for(E c:val){
            array[i]=c;
            i++;
        }
        this.valueArr = array;
    }
    public E check(){

        Arrays.sort(valueArr);
        E largestValue=valueArr[valueArr.length-1];
        printMax(largestValue);
        return largestValue;
    }

    public static <E> void printMax(E value){
        System.out.println(value);
    }

}
