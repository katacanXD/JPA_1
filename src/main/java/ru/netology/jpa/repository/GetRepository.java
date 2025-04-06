package ru.netology.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.jpa.entity.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface GetRepository extends JpaRepository<Person, Long> {
    List<Person> getPersonsByCity(String city);

    List<Person> getPersonsByUnderAge(int age);

    Optional<Person> getPersonsByNameSurname(String name, String surname);
}
