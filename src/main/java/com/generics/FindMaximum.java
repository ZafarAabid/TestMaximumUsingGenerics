package com.generics;

public class FindMaximum {

    public static <E extends Comparable<E>> E findLargest(E firstValue, E secoundValue, E thirdValue) {
        E max=firstValue;
        if(secoundValue.compareTo(max)>0)
            max=secoundValue;
        if(thirdValue.compareTo(max)>0) {
            max=thirdValue;
        }
        return max;
    }
}
