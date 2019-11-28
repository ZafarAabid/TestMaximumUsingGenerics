package com.generics;

public class FindMaximum {
    public static Integer findLargest(Integer i, Integer i2,Integer i3) {
        Integer max=i;
        if(i2.compareTo(max)>0)
            max=i2;
        if(i3.compareTo(max)>0)
            max=i3;
        return max;

    }


}
