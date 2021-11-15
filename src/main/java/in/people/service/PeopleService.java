package in.people.service;

import in.people.entity.People;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PeopleService {
    Flux<People> getAllPeople();

    Mono<People> savePeople(People people);

    Mono<People> findPeopleBYId(String id);

    Mono<String> deleteById(String id);
}
