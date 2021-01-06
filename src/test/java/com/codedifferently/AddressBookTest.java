package com.codedifferently;

import com.codedifferently.database.DataBase;
import com.codedifferently.database.DataBaseConnectionException;
import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {


    Person person = new Person("Aakriti","Shrestha",27,"Aakriti.stha01@gmail.com");
    DataBase dataBase = new DataBase();
    AddressBook addressBook = new AddressBook(dataBase);

    public AddressBookTest() throws DataBaseConnectionException {
    }




    @Test
    public void setAndGetOwnerTest(){
        addressBook.setOwner(person);
        Person expected = person;
        Person actual = addressBook.getOwner();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addPersonTest(){
        Person expected = person;
        Person actual = addressBook.addPerson(person.);

}

}
