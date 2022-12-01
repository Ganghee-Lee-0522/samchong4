package start18.testservice.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import start18.testservice.service.PostsService;

@Controller
@AllArgsConstructor

public class WebController {

    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "main";
    }
    @GetMapping("/menu")
    public String menu(Model model) {
        return "menu";
    }

    @GetMapping("/main")
    public String main2(Model model) {
        return "main2";
    }
}
