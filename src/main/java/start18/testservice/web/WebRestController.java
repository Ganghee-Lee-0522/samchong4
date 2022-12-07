package start18.testservice.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import start18.testservice.dto.posts.CctvSaveRequestDto;
import start18.testservice.dto.posts.PostsSaveRequestDto;
import start18.testservice.service.CctvPostsService;
import start18.testservice.service.PostsService;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;
    private CctvPostsService cctvPostsService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto) {

        return postsService.save(dto);
    }

    @PostMapping("/cctvposts")
    public Long cctvPosts(@RequestBody CctvSaveRequestDto dto) {

        return cctvPostsService.save(dto);
    }
}
