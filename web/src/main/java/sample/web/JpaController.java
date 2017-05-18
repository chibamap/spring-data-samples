package sample.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sample.jpa.JpaService;
import sample.jpa.Person;

import java.util.List;

/**
 * Created by chibana on 2017/05/16.
 */
@RequestMapping("/jpa")
@RestController
public class JpaController {

    private static final String template = "Hello, %s!";

    @Autowired
    private JpaService jpaService;

    @RequestMapping("/test")
    public List<Person> test(@RequestParam(value="groupName", defaultValue="hoge") String name) {
        return jpaService.findByGname(name);
    }
}
