package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTests {

    @Test
    public void givenNumber_IfFindMaximum_ReturnThatIntegerValue() {
        System.out.println("givenNumber_IfFindMaximum_ReturnThatIntegerValue");

        Integer largest=FindMaximum.findLargest(11,21,3);
        System.out.println("largest number is "+largest);
        Assert.assertSame(21,largest);
    }

    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatFloatValue() {
        System.out.println("givenNumbers_ifFindMaximum_ReturnThatFloatValue");

        Float largest=FindMaximum.findLargest(1.1f,21.1f,3.0f);
        System.out.println("largest number is "+largest);
        Assert.assertEquals(21.1,largest,0.01);
    }

    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatStringValue() {
        System.out.println("givenNumbers_ifFindMaximum_ReturnThatStringValue");

        String largest=FindMaximum.findLargest("aaz","sadfg","qwer");
        System.out.println("largest number is "+largest);
        Assert.assertSame("sadfg",largest);
    }

    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatIntegerValue_UsingConstructor() {
        System.out.println("givenNumbers_ifFindMaximum_ReturnThatIntegerValue_UsingConstructor");

        FindMaximum findMaximum = new FindMaximum<Integer>(456,85,10);
        Integer largest = (Integer) findMaximum.findLargest();
        System.out.println("largest number is "+largest);
        Assert.assertEquals(new Integer(456),largest);
    }
    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatStringValue_UsingConstructor() {
        System.out.println("givenNumbers_ifFindMaximum_ReturnThatStringValue_UsingConstructor");

        FindMaximum findMaximum = new FindMaximum<String>("asd","qwe","zxc");
        String largest = (String) findMaximum.findLargest();
        System.out.println("largest number is "+largest);
        Assert.assertEquals("zxc",largest);
    }

    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatFloatValue_UsingConstructor() {
        System.out.println("givenNumbers_ifFindMaximum_ReturnThatFloatValue_UsingConstructor");

        FindMaximum findMaximum = new FindMaximum<Float>(1.1f,20.0f,151.1f);
        Float largest = (Float) findMaximum.findLargest();
        System.out.println("largest number is "+largest);
        Assert.assertEquals(new Float(151.1f),largest,0.1);
    }


}
