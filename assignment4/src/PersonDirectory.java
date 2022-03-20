
import java.util.HashMap;
import model.Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stanchen
 */
public class PersonDirectory {
    private HashMap<String, Person> people = new HashMap<>();
    private String personDirectoryId;

    public PersonDirectory(String personDirectoryId) {
        this.personDirectoryId = personDirectoryId;
    }

    public void addPerson(Person person){
        this.people.put(person.getFullName(), person);
    }

    public void updatePerson(Person person){
        this.people.replace(person.getFullName(), person);
    }

    public void remove(String personId){
        this.people.remove(personId);
    }

    public Person getPerson(String personId){
        return this.people.get(personId);
    }

    public String getPersonDirectoryId() {
        return personDirectoryId;
    }
}
