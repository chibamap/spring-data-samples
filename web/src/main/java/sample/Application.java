package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sample.jpa.Person;
import sample.jpa.PersonRepository;

import java.util.List;

/**
 * Created by chibana on 2017/05/11.
 */
@SpringBootApplication(scanBasePackages = {"sample"})
public class Application {

    public static void main(String[] args) {
        String resoucePath = "src/main/resources/applicationContext.xml";

        SpringApplication.run(Application.class, args);
        /*
        try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
            PersonRepository repo  = ctx.getBean(PersonRepository.class);
            List<Person> people = repo.findAll();
            for (Person person : people) {
                System.out.println(person.getFirstName());
            }
        }
        */
    }
}
