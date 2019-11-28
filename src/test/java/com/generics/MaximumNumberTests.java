package com.generics;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTests {

    @Test
    public void givenNumber_IfFindMaximum_ReturnThatValue() {

        Integer largest=FindMaximum.findLargest(11,21,3);
        System.out.println("largest number is "+largest);
        Assert.assertSame(21,largest);
    }
}
