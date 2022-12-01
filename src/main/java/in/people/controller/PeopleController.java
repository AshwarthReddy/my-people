package in.people.controller;

import in.people.entity.People;
import in.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;



    @GetMapping
    public Flux<People> getAllPeople(){
        return  peopleService.getAllPeople();
    }

    @PostMapping
    public Mono<People> savePeople(@RequestBody People people){
        return peopleService.savePeople(people);
    }

    @GetMapping("/{id}")
    public Mono<People> findPeopleById(@PathVariable String id){
        return peopleService.findPeopleBYId(id);
    }
    @DeleteMapping("/{id}")
    public Mono<String> deleteByPeople(@PathVariable String id){
        return peopleService.deleteById(id);
    }

}
