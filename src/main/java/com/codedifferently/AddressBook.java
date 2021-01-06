package com.codedifferently;

import com.codedifferently.database.DataBase;

import java.util.List;

public class AddressBook {
    private DataBase dataBase;
    private Person owner;
    private List<Person> people;

    public AddressBook(DataBase dataBase){
        this.dataBase = dataBase;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public Person getPersonByEmail(String email) {
        return null;
    }

    public List<Person> getAllPeople(){
        return people;
    }

    public boolean saveAll(){
        return true;
    }
}
