package th.mfu;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello World!";
    }

    @RequestMapping("/")
    String index() {
        return "Welcome to the Hello World application!";
    }

    @RequestMapping("/hi/{name}")
    String hi(@PathVariable("name") String name) {
        return "Hi " + name + "!";
    }


}
