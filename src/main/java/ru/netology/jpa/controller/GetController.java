package ru.netology.jpa.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jpa.entity.Person;
import ru.netology.jpa.service.GetServiceImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetController {
    public final GetServiceImpl service;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }

}
