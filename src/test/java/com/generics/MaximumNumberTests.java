package com.generics;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTests {

    @Test
    public void givenNumber_IfFindMaximum_ReturnThatIntegerValue() {

        Integer largest=FindMaximum.findLargest(11,21,3);
        System.out.println("largest number is "+largest);
        Assert.assertSame(21,largest);
    }

    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatFloatValue() {

        Float largest=FindMaximum.findLargest(1.1f,21.1f,3.0f);
        System.out.println("largest number is "+largest);
        Assert.assertEquals(21.1,largest,0.01);
    }

    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatStringValue() {

        String largest=FindMaximum.findLargest("aaa","zzz","qqq");
        System.out.println("largest number is "+largest);
        Assert.assertSame("zzz",largest);
    }

}
