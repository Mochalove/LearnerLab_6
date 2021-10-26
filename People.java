package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList;

    public People() {
        this.personList = new ArrayList<PersonType>();
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public PersonType findById(long id) {
        for (PersonType person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    public boolean contains(PersonType person) {
        return personList.contains(person);
    }
    public void remove(PersonType person){
        personList.remove(person);
    }
    public void removeById(long id) {
        for (Person i : personList) {
            if (i.getId() == id) {
                remove((PersonType) i);
            }
        }
    }
        public void removeAll(){
            personList.clear();
        }
        public Integer count(){
            return personList.size();
        }
    public PersonType[] toArray(){
        return (PersonType[]) personList.toArray(new Person[0]);
    }
    @Override
    public Iterator<PersonType> iterator(){
        return personList.iterator();
    }
    public List<PersonType>getPersonList(){
        return personList;
    }
}