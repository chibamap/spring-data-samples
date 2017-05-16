package sample.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sample.jpa.Person;
import sample.jpa.PersonRepository;

import java.util.List;

/**
 * Created by chibana on 2017/05/16.
 */
@RequestMapping("/jpa")
@RestController
public class JpaController {

    private static final String template = "Hello, %s!";

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/test")
    public List<Person> test(@RequestParam(value="name", defaultValue="World") String name) {
        return personRepository.findByGroupName(name);
        /*
        System.out.println(name);

        return personRepository.findAll();*/

    }
}
