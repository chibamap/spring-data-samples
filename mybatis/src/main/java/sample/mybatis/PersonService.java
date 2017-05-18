package sample.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.mybatis.mapper.PersonMapper;
import sample.mybatis.model.Groups;
import sample.mybatis.model.Person;
import sample.mybatis.model.PersonExample;

import java.util.List;

/**
 * Created by chibana on 2017/05/16.
 */
//@Transa
@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public List<Person> selectByGroup(String name) {
        Groups group = new Groups();
        group.setName(name);
        return personMapper.selectByGroup(group);
    }
}
