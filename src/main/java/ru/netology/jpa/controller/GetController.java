package ru.netology.jpa.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.netology.jpa.entity.Person;
import ru.netology.jpa.service.GetServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class GetController {
    public final GetServiceImpl service;

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }

    @PostMapping("/create")
    public Person createPerson(@RequestBody Person person) {
        return service.createPerson(person);
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return service.getPersonById(id);
    }

    @GetMapping("/delete/{id}")
    public void deletePersonById(@PathVariable Long id) {
        service.deletePersonById(id);
    }

    @GetMapping("/by-city")
    public List<Person> getPersonByCity(@RequestParam String city) {
        return service.getPersonsByCity(city);
    }

    @GetMapping("/age-less-than")
    public List<Person> getPersonsByUnderAge(@RequestParam int age) {
        return service.getPersonsByUnderAge(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Person> getPersonsByNameSurname(@RequestParam String name, @RequestParam String surname) {
        return service.getPersonsByNameSurname(name, surname);
    }

}
