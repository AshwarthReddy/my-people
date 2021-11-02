package in.people.controller;

import in.people.dto.PeopleDto;
import in.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;



    @GetMapping("/{pageNum}/{pageSize}")
    public Flux<ServerResponse> getAllPeople(@PathVariable Integer pageNum, Integer pageSize){

        Flux<PeopleDto> response = peopleService.getAllPeople(pageNum, pageSize);

        return null;

    }

}
