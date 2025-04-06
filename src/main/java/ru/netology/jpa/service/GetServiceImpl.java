package ru.netology.jpa.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.jpa.entity.Person;
import ru.netology.jpa.repository.GetRepositoryImpl;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetServiceImpl implements GetService {
    public final GetRepositoryImpl repository;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
