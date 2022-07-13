package sqliteproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Pages {

    @GetMapping
    String index() {
        return "Working...";
    }
}
