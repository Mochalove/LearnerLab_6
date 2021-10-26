package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void studentImplementationTest(){
        Student student001 = new Student();
        Assert.assertTrue(student001 instanceof Learner);
    }
    @Test
    public void studentInheritanceTest(){
        Student student002 = new Student();
        Assert.assertTrue(student002 instanceof Person);
    }
    @Test
    public void studentLearnTest(){
        Student student003 = new Student();
        Double inp = 5.0;
        student003.learn(inp);
        Double act = student003.getTotalStudyTime();
        Assert.assertEquals(inp, act);
    }
}
