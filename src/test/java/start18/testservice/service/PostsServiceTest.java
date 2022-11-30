package start18.testservice.service;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import start18.testservice.domain.posts.Posts;
import start18.testservice.domain.posts.PostsRepository;
import start18.testservice.dto.posts.PostsSaveRequestDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsServiceTest {

    @Autowired
    private PostsService postsService;

    @Autowired
    private PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void Dto_데이터가_posts_테이블에_저장된다() {
        // given
        PostsSaveRequestDto dto = PostsSaveRequestDto.builder()
                .author("gh_5226@ewhain.net")
                .content("테스트")
                .title("테스트 타이틀")
                .build();

        // when
        postsService.save(dto);

        // then
        Posts posts = postsRepository.findAll().get(0);
        Assertions.assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
        Assertions.assertThat(posts.getContent()).isEqualTo(dto.getContent());
        Assertions.assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
    }
}
