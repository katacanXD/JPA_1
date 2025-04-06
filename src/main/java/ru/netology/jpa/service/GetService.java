package ru.netology.jpa.service;

import ru.netology.jpa.entity.Person;

import java.util.List;
import java.util.Optional;

public interface GetService {
    List<Person> getPersonsByCity(String city);

    List<Person> getPersonsByUnderAge(int age);

    Optional<Person> getPersonsByNameSurname(String name, String surname);
}
