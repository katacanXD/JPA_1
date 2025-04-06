package ru.netology.jpa.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.jpa.entity.Person;
import ru.netology.jpa.repository.GetRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetServiceImpl implements GetService {
    public final GetRepository repository;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }

    @Override
    public List<Person> getPersonsByUnderAge(int age) {
        return repository.getPersonsByUnderAge(age);
    }

    @Override
    public Optional<Person> getPersonsByNameSurname(String name, String surname) {
        Optional<Person> optionalPerson = repository.getPersonsByNameSurname(name, surname);
        personNotFound(optionalPerson);
        return Optional.of(optionalPerson.get());
    }

    private void personNotFound(Optional<Person> optionalPerson) {
        if (optionalPerson.isEmpty()) {
            throw new RuntimeException("Person not found");
        }
    }

    public Person getPersonById(Long id) {
        Optional<Person> optionalPerson = repository.findById(id);
        personNotFound(optionalPerson);
        return optionalPerson.get();
    }

    public void deletePersonById(Long id) {
        repository.deleteById(id);
    }

    public Person createPerson(Person person) {
        return repository.save(person);
    }
}
