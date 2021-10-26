package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
   @Test
      public void constructorTest(){
      String name = "Cece";
      long id = 7;
      Person person = new Person(id,name);
      Assert.assertEquals(id,person.getId());
      Assert.assertEquals(name, person.getName());
   }
   @Test
   public void testSetName(){
      String name = "Cece";
      long id = 7;
      Person person = new Person(id, name);
      person.setName("Cece");
      Assert.assertEquals("Cece", person.getName());
   }
}

