package com.gastitan.demo.controller;

import com.gastitan.demo.model.Person;
import com.gastitan.demo.service.GastitanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GastitanController {

    private final GastitanService service;

    public GastitanController(final GastitanService service) {
        this.service = service;
    }

    @PostMapping("/person")
    public @ResponseBody Person createPerson(@RequestBody final Person personRequest) {
        return service.createPerson(personRequest);
    }

    @GetMapping("/person/{id}")
    public @ResponseBody Person getPerson(@PathVariable final long id) {
        return service.getPerson(id);
    }
}
