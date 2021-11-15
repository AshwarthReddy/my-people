package in.people.service.impl;

import in.people.entity.People;
import in.people.repo.PeopleRepository;
import in.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    PeopleRepository peopleRepository;

    @Override
    public Flux<People> getAllPeople() {
        return peopleRepository.findAll();
    }

    @Override
    public Mono<People> savePeople(People people) {
        return peopleRepository.save(people);
    }

    @Override
    public Mono<People> findPeopleBYId(String id) {
        return peopleRepository.findById(id);
    }

    @Override
    public Mono<String> deleteById(String id) {
        peopleRepository.deleteById(id);
        return Mono.just("People Deleted Successfully: people id is: " +id);
    }
}
