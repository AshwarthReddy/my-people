package in.people.controller;

import in.people.entity.People;
import in.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;



    @GetMapping
    public Flux<People> getAllPeople(){
        return  peopleService.getAllPeople();

    }

}
