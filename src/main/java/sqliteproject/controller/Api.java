package sqliteproject.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sqliteproject.model.Person;
import sqliteproject.service.IPersonService;
import sqliteproject.service.PersonService;

@RestController("/api/person")
class Api {

    private final IPersonService personService;

    public Api(IPersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/api/person")
    List<Person> index() {
        return (List<Person>) personService.findAll();
    }

    @GetMapping("/api/person/create")
    String store() {
        return "creating person...";
    }
}
