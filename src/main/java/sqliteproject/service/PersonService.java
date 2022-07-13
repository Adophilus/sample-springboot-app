package sqliteproject.service;

import java.util.List;
import org.springframework.stereotype.Service;
import sqliteproject.model.Person;
import sqliteproject.repository.PeopleRepository;

@Service
public class PersonService implements IPersonService {

    private final PeopleRepository repository;

    public PersonService(PeopleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> findAll() {
        return (List<Person>) repository.findAll();
    }
}
