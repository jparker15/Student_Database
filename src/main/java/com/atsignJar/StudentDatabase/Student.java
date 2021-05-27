package com.atsignJar.StudentDatabase;

import org.springframework.data.annotation.Id;

public class Student {
    @Id
    public String id;
    public String firstName;
    public String lastName;
    private int age;

    public Student() {

    }

    public Student(String firstName, String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format(
                "Student[id=%s, firstName='%s'm lastName='%s' age='%s'",
                id,firstName,lastName,age);

    }

}
