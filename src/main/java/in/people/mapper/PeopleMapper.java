package in.people.mapper;

import in.people.dto.PeopleDto;
import in.people.entity.People;
import org.mapstruct.Mapper;

@Mapper( componentModel = "spring")
public interface PeopleMapper {

    PeopleDto convertPeopleDto(People people);


}
