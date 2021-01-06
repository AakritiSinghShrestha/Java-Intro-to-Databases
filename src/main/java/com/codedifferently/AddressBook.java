package com.codedifferently;

import com.codedifferently.database.DataBase;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private DataBase dataBase;
    private Person owner;
    private List<Person> people;



    public AddressBook(DataBase dataBase) {
        this.people = new ArrayList<>();
        this.dataBase = dataBase;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person person) {
        this.owner = person;
    }

    // public void addPerson(Person person, Connection connection) throws SQLException
//        {
//            String query = "INSERT INTO Users ("
//                    + " first_name,"
//                    + " last_name,"
//                    + " email,"
//                    + " age) VALUES ("
//                    + "?, ?, ?, ?)";
//
//            try {
//                // set all the preparedstatement parameters
//                PreparedStatement st = connection.prepareStatement(query);
//                st.setString(1, person.getFirstName());
//                st.setString(2, person.getLastName());
//                st.setString(3, person.getEmail());
//                st.setInt(4,person.getAge());
//                // execute the preparedstatement insert
//                st.executeUpdate();
//                st.close();
//            }
//            catch (SQLException se)
//            {
//                // log exception
//                throw se;
//            }
//        }
    public Person addPerson(Person person){
        people.add(person);
        return person;
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public Person getPersonByEmail(String email) {

        return null;
    }

    public List<Person> getAllPeople(){
        return people;
    }

    public boolean saveAll(){
        return false;
    }
}
