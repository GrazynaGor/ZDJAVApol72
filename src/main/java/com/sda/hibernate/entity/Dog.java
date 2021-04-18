package com.sda.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer age;
    String race;

    public Dog() {
    }

    public Dog(String name, Integer age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public Long getId() {
        return id;
    }

    public void setRace(String race) {
        this.race= race;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

