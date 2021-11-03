package in.people.service;

import in.people.entity.People;
import reactor.core.publisher.Flux;

public interface PeopleService {
    Flux<People> getAllPeople();
}
