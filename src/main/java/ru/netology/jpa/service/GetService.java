package ru.netology.jpa.service;

import ru.netology.jpa.entity.Person;

import java.util.List;


public interface GetService {
    List<Person> getPersonsByCity(String city);
}
