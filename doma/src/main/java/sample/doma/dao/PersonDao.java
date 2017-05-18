package sample.doma.dao;

import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;
import sample.doma.entity.Groups;
import sample.doma.entity.Person;

import java.util.List;

/**
 */
@Dao
@ConfigAutowireable()
public interface PersonDao {

    /**
     * @param id
     * @return the Person entity
     */
    @Select
    Person selectById(Long id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Person entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Person entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Person entity);

    @Select
    List<Person> findByGroup(Groups group);
}
