package sqliteproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sqliteproject.model.Person;

@Repository
public interface PeopleRepository extends CrudRepository<Person, Integer> {}
