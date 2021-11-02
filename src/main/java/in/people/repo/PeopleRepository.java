package in.people.repo;

import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends ReactiveSortingRepository<PeopleRepository, String> {

}
