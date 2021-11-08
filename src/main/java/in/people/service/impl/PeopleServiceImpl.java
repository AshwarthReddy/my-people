package in.people.service.impl;

import in.people.entity.People;
import in.people.repo.PeopleRepository;
import in.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    PeopleRepository peopleRepository;

    @Override
    public Flux<People> getAllPeople() {
        return peopleRepository.findAll();
    }
}
