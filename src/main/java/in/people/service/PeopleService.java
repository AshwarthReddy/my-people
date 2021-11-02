package in.people.service;

import in.people.dto.PeopleDto;
import reactor.core.publisher.Flux;

public interface PeopleService {
    Flux<PeopleDto> getAllPeople(Integer pageNum, Integer pageSize);
}
