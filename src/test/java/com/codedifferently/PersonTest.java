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

    @Test
    public void getLastNameTest(){
        String expected = "Shrestha";

        String actual = person.getLastName();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void setLastNameTest(){
        person.setLastName("Mishra");
        String expected = "Mishra";

        String actual = person.getLastName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAgeTest(){
        Integer expected = 26;

        Integer actual = person.getAge();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void setAgeTest(){
        person.setAge(20);
        Integer expected = 20;

        Integer actual = person.getAge();

        Assert.assertEquals(expected,actual);
    }
}
