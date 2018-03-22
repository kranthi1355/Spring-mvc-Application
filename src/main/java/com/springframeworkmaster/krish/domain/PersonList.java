package com.springframeworkmaster.krish.domain;

import java.util.List;

public class PersonList {
    List<Person> persons;

    public PersonList(){}

    public PersonList(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
