package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    Person person = new Person("Aakriti","Shrestha",26,"Aakriti.stha00@gmail.com");

    @Test
    public void getFirstNameTest(){
        String expected = "Aakriti";

        String actual = person.getFirstName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setFirstNameTest(){
        person.setFirstName("Riya");
        String expected = "Riya";

        String actual = person.getFirstName();

        Assert.assertEquals(expected,actual);
    }
}
