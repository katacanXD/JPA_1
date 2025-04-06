package ru.netology.jpa.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.netology.jpa.entity.Person;

import java.util.List;

public class GetRepositoryImpl implements GetRepository {
    private static final String query = "SELECT Person.personPrimaryKey.name from Person p where p.city_of_living = :city";
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(query, Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
