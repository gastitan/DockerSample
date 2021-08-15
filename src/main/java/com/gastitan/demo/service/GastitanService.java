package com.gastitan.demo.service;

import com.gastitan.demo.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
@Slf4j
public class GastitanService {

    private final Map<Long, Person> personsMap;

    public GastitanService() {
        personsMap = new HashMap<>();
    }

    public Person createPerson(final Person personRequest) {
        var newPerson = new Person();

        var newId = new Random().nextLong();

        newPerson.setAge(personRequest.getAge());
        newPerson.setName(personRequest.getName());
        newPerson.setId(newId);

        personsMap.put(newId, newPerson);
        log.info("New Person added with ID {}", newId);

        return newPerson;
    }

    public Person getPerson(final long id) {
        return personsMap.get(id);
    }
}
