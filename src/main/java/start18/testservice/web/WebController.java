package start18.testservice.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import start18.testservice.service.CctvPostsService;
import start18.testservice.service.PostsService;

@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;
    private CctvPostsService cctvPostsService;

    @GetMapping("/report")
    public String report(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "report";
    }

    @GetMapping("/")
    public String main(Model model) {
        return "menu";
    }

    @GetMapping("/cctv")
    public String cctv(Model model) {
        model.addAttribute("cctvposts", cctvPostsService.AllDesc());
        return "cctv";
    }

}
