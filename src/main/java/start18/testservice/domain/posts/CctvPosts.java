package start18.testservice.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import start18.testservice.domain.BaseTimeEntity;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class CctvPosts extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long no;

    @Column(length = 500, nullable = false)
    private String place;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(length = 20, nullable = false)
    private String admin;

    @Builder
    public CctvPosts(String place, String content, String admin) {
        this.place = place;
        this.content = content;
        this.admin = admin;
    }
}
