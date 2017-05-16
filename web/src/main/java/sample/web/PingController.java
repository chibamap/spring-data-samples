package sample.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chibana on 2017/05/16.
 */
@RestController
public class PingController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/ping")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return String.format(template, name);
    }
}
