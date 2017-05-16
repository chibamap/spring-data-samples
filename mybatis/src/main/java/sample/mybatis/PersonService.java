package sample.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.mybatis.mapper.PersonMapper;
import sample.mybatis.model.Person;

/**
 * Created by chibana on 2017/05/16.
 */
//@Transa
@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public Person hey(Long id) {
        return personMapper.selectByPrimaryKey(id);
    }
}
