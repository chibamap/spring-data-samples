package sample.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chibana on 2017/05/18.
 */
@Service
public class JpaService {
    @Autowired
    PersonRepository personRepository;

    public List<Person> findByGname(String gname) {
        return personRepository.findByGroupName(gname);
    }
}
