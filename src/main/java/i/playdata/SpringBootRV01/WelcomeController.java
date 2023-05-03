package i.playdata.SpringBootRV01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    @RequestMapping("/")
    public String welcome() {
        return "Welcome Spring Boot!"; // Controller -> templates -> welcome.html
    }
    @RequestMapping("/{goal}")
    public String welcome2(@PathVariable String goal, Model model) {
        model.addAttribute("goal", goal);
        return "Welcome Spring Boot! 2번"; // Controller -> templates -> welcome.html
    }
}
