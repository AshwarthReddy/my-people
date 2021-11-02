package in.people.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class People {

    @Id
    private String id;
    private String name;
    private String mobileId;
    private String emailId;

}
