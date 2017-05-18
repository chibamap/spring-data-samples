package sample.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sample.mybatis.model.Person;
import sample.mybatis.PersonService;

import java.util.List;


/**
 * Created by chibana on 2017/05/16.
 */
@RequestMapping("/mybatis")
@RestController
public class MybatisController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/test")
    public List<Person> test(@RequestParam(value="groupName", defaultValue="hoge") String groupName) {
        return personService.selectByGroup(groupName);
    }
}

