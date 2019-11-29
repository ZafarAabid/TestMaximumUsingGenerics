package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTests {

//    FindMaximum findMaximum = new FindMaximum();
    @Test
    public void givenNumber_IfFindMaximum_ReturnThatIntegerValue() {
        System.out.println("givenNumber_IfFindMaximum_ReturnThatIntegerValue");

        FindMaximum findMaximum = new FindMaximum<Integer>(11,21,3);
        Assert.assertSame(21,findMaximum.check());
    }

    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatFloatValue() {
        System.out.println("givenNumbers_ifFindMaximum_ReturnThatFloatValue");

        FindMaximum findMaximum=new FindMaximum<Float>(1.1f,21.1f,3.0f);
        Assert.assertEquals(21.1f,(Float) findMaximum.check(),0.01);
    }

    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatStringValue() {
        System.out.println("givenNumbers_ifFindMaximum_ReturnThatStringValue");

        FindMaximum findMaximum =new FindMaximum<String>("aaz","sadfg","qwer");
        Assert.assertSame("sadfg",findMaximum.check());
    }

    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatIntegerValue_UsingConstructor() {
        System.out.println("givenNumbers_ifFindMaximum_ReturnThatIntegerValue_UsingConstructor");

        FindMaximum findMaximum = new FindMaximum<Integer>(456,85,10);
        Integer largest = (Integer) findMaximum.check();
        Assert.assertEquals(new Integer(456),largest);
    }
    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatStringValue_UsingConstructor() {
        System.out.println("givenNumbers_ifFindMaximum_ReturnThatStringValue_UsingConstructor");

        FindMaximum findMaximum = new FindMaximum<String>("asd","qwe","zxc");
        String largest = (String) findMaximum.check();
        Assert.assertEquals("zxc",largest);
    }

    @Test
    public void givenNumbers_ifFindMaximum_ReturnThatFloatValue_UsingConstructor() {
        System.out.println("givenNumbers_ifFindMaximum_ReturnThatFloatValue_UsingConstructor");

        FindMaximum findMaximum = new FindMaximum<Float>(1.1f,20.0f,151.1f);
        Float largest = (Float) findMaximum.check();
        Assert.assertEquals(new Float(151.1f),largest,0.1);
    }


}
