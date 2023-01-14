package com.example.demoapiwithliquibase.services;

import com.example.demoapiwithliquibase.models.Person;
import com.example.demoapiwithliquibase.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    public Person getPersonById(Long id){
        return personRepository.findById(id).orElseThrow(null);
    }

}
