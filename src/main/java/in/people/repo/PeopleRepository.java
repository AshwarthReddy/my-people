package in.people.repo;

import in.people.entity.People;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends ReactiveMongoRepository<People, String> {

}
