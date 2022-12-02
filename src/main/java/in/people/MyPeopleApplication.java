package in.people;

import in.people.entity.People;
import in.people.repo.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class MyPeopleApplication {

    @Autowired
    private PeopleRepository peopleRepository;

    public static void main(String[] args) {

        SpringApplication.run(MyPeopleApplication.class, args);
    }

    @PostConstruct
    public void init(){
        List<People> peoples = List.of(
                new People("1", "Aswarth", "7093421780", "banr20@gmail.com"),
                new People("2", "Priya", "7093421780", "banr20@gmail.com"),
                new People("3", "Prabha", "7093421780", "banr20@gmail.com"),
                new People("4", "Prashanthi", "7093421780", "banr20@gmail.com"),
                new People("5", "Gayithri", "7093421780", "banr20@gmail.com")
        );

        peopleRepository.saveAll(peoples);
    }

}
