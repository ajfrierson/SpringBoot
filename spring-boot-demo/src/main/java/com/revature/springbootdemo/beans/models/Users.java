package com.revature.springbootdemo.beans.models;

import javax.persistence.*;


@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_Id")
    private Integer user_Id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private Integer age;

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
