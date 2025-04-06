package ru.netology.jpa.repository;

import ru.netology.jpa.entity.Person;

import java.util.List;

public interface GetRepository {
    List<Person> getPersonsByCity(String city);
}
