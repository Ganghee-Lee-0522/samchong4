package start18.testservice.dto;

import lombok.Getter;
import start18.testservice.domain.posts.CctvPosts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class CctvMainResponseDto {
    private Long no;
    private String place;
    private String content;
    private String admin;
    private String modifiedDate;

    public CctvMainResponseDto(CctvPosts entity) {
        no = entity.getNo();
        place = entity.getPlace();
        content = entity.getContent();
        admin = entity.getAdmin();
        modifiedDate = toStringDateTime(entity.getModifiedDate());
    }

    private String toStringDateTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}
