package sample.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import java.util.List;

/**
 * Created by chibana on 2017/05/16.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>,
        JpaSpecificationExecutor<Person> {


    @Query("select p from Person p where p.groupId in (select g.id from Group g where g.name = :name )")
    List<Person> findByGroupName(@Param("name") String groupName);

}
