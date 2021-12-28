package com.example.kataspringreactivo.controller;

import com.example.kataspringreactivo.entity.Person;
import com.example.kataspringreactivo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public Mono<Void> post(@RequestBody reactor.core.publisher.Mono<Person> personMono){
        return personMono.flatMap(personService::insert);
    }

    @GetMapping("/{id}")
    public Mono<Person> getPerson(@PathVariable String id) {
        return Mono.just(new Person());
    }

    @PutMapping
    public Mono<Void> update(@RequestBody Mono<Person> personMono) {
        return Mono.empty();
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return Mono.empty();
    }

    @GetMapping
    public Flux<Person> list() {
        return personService.listAll();
    }
}
