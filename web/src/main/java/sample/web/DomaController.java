package sample.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sample.doma.service.DomaService;
import sample.doma.entity.Person;

import java.util.List;

/**
 * Created by chibana on 2017/05/16.
 */
@RequestMapping("/doma")
@RestController
public class DomaController {

    private static final String template = "Hello, %s!";

    @Autowired
    private DomaService domaService;

    @RequestMapping("/test")
    public List<Person> test(@RequestParam(value="groupName", defaultValue="hoge") String name) {
        return domaService.findByGname(name);
    }
}
