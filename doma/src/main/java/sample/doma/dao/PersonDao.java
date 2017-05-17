package sample.doma.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.stereotype.Repository;
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
    List<Person> findByGroupName(String groupName);
}
