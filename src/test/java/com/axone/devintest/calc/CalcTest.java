package com.axone.devintest.calc;

import org.example1.Addition;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    @Test
    public void testAddition(){
        Addition add = new Addition();
        Assert.assertEquals(40, add.addition(10,30));
    }

    @Test
    public void testAddition2(){
        Addition add = new Addition();
        Assert.assertEquals(40, add.addition(10,30));
    }
}
