package com.company;

public class Person {
    private String name;
    private String surName;
    private int age;
    private int workDate;

    public Person() {}

    public Person(String name, String surName, int age, int workDate) {
        try {
            if (age < 0) {
                throw new ExeptionFromAke("Error! Minus ne pozvolitelno!");
            }
            this.age = age;
        } catch (ExeptionFromAke e) {
            System.err.println(e.getMessage());
        }
        try {
            if (name.matches("![A-Za-z0-9]*")) {
                throw new ExeptionFromString("Error this Name");
            }
        } catch (ExeptionFromString e) {
            e.printStackTrace();
        }
        try {
            if (workDate < 2015 || workDate > 2023) {
                throw new ExeptionFromAke("Ибан что ли? ))");
            }
            this.workDate= workDate;
        }catch (ExeptionFromAke e) {
            System.err.println(e.getMessage());
        }
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkDate() {
        return workDate;
    }

    public void setWorkDate(int workDate) {
        this.workDate = workDate;
    }

    @Override
    public String toString() {
        return "Person name: " + name +
                " \nSurName: " + surName +
                " \nAge: " + age +
                " \nWorkDate: " + workDate;
    }
}
