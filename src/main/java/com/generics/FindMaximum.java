package com.generics;

public class FindMaximum<E extends Comparable> {
        E firstValue;
        E secoundValue;
        E thirdValue;

    public FindMaximum(E firstValue, E secoundValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secoundValue = secoundValue;
        this.thirdValue = thirdValue;
    }

    public <E extends Comparable> E findLargest() {

        E max=(E) findLargest(firstValue,secoundValue,thirdValue);
        return max;
    }
    public static <E extends Comparable<E>> E findLargest(E firstValue, E secoundValue, E thirdValue) {
        E max=firstValue;

        if(secoundValue.compareTo(max)>0)
            max=secoundValue;
        if(thirdValue.compareTo(max)>0) {
            max=thirdValue;
        }
        FindMaximum.printMax("Largest input is "+max);
        return max;
    }
    public static <E> void printMax(E value){
        System.out.println(value);
    }
}
