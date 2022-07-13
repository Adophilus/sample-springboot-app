package sqliteproject.service;

import java.util.List;
import sqliteproject.model.Person;

public interface IPersonService {
    List<Person> findAll();
}
