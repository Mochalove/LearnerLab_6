package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private String name;
    private Double totalStudyTime;
    private long id;

    public Student(long id, String name){
        super(id, name);
    }
    public Student(){
        super(0,"");
    }

    public void learn(Double numberOfHours) {
        this.totalStudyTime = numberOfHours;
    }
    public Double getTotalStudyTime() {
        return null;
    }
}





