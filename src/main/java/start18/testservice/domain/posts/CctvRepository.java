package start18.testservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface CctvRepository extends JpaRepository<CctvPosts, Long> {
    @Query("SELECT p " +
            "FROM CctvPosts p " +
            "ORDER BY p.no DESC")
    Stream<CctvPosts> AllDesc();
}
