package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest {
    @Test
    public void testAdd() {
        List<Person> personList = new ArrayList<>();
        Person ppl = new Person(27, "Cece");
        personList.add(ppl);
        Assert.assertTrue(personList.contains(ppl));
    }
    @Test
    public void removeTest(){
        List<Person> personList = new ArrayList<>();
        Person person = new Person(27, "Cece");
        personList.remove(person);
        Assert.assertFalse(personList.contains(person));
    }
}