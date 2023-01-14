package com.example.demoapiwithliquibase.controllers;

import com.example.demoapiwithliquibase.models.Person;
import com.example.demoapiwithliquibase.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person getPersonById(@PathVariable("id") Long id){
        return personService.getPersonById(id);
    }


}
