package com.revature.springbootdemo.beans.models;

public class Users {
    private Integer user_Id;
    private String firstName;
    private String lastName;
    private int age;

    public Users() {
    }

    public Users(Integer user_Id, String firstName, String lastName, int age) {
        this.user_Id = user_Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return user_Id;
    }

    public void setId(int id) {
        user_Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
