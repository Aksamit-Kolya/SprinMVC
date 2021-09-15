package nick.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirsController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
