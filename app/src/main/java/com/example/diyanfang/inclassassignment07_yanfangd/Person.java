package com.example.diyanfang.inclassassignment07_yanfangd;

/**
 * Created by diyanfang on 4/1/18.
 */

public class Person {

    private String name;
    private int age;
    private boolean isGraduated;

    public Person(String name, int age, boolean isGraduated){
        this.name = name;
        this.age = age;
        this.isGraduated = isGraduated;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }

    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nIs graduated?" + isGraduated;
    }


}
