package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {


    @Test
    public void getFirstNameTest(){
        Person person = new Person("Aakriti","Shrestha",26,"Aakriti.stha00@gmail.com");

        String expected = "Aakriti";

        String actual = person.getFirstName();

        Assert.assertEquals(expected,actual);
    }
}
