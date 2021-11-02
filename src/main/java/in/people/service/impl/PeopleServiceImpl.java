package in.people.service.impl;

import in.people.dto.PeopleDto;
import in.people.repo.PeopleRepository;
import in.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    PeopleRepository peopleRepository;

    @Override
    public Flux<PeopleDto> getAllPeople(Integer pageNum, Integer pageSize) {

        Pageable.ofSize(pageSize);

        peopleRepository.findAll();

        return null;
    }
}
