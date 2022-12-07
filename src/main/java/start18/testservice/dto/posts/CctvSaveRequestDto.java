package start18.testservice.dto.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import start18.testservice.domain.posts.CctvPosts;

@Getter
@Setter
@NoArgsConstructor
public class CctvSaveRequestDto {

    private String place;
    private String content;
    private String admin;

    @Builder
    public CctvSaveRequestDto(String place, String content, String admin) {
        this.place = place;
        this.content = content;
        this.admin = admin;
    }
    public CctvPosts toEntity() {
        return CctvPosts.builder()
                .place(place)
                .content(content)
                .admin(admin)
                .build();
    }
}
