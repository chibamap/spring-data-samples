package sample.doma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.doma.dao.PersonDao;
import sample.doma.entity.Person;

import java.util.List;

/**
 * Created by chibana on 2017/05/17.
 */
@Service
public class DomaService {
    @Autowired
    PersonDao personDao;

    public List<Person> findByGname(String gname) {
        return personDao.findByGroupName(gname);
    }
}
