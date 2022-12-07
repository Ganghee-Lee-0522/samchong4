package start18.testservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import start18.testservice.domain.posts.CctvRepository;
import start18.testservice.dto.CctvMainResponseDto;
import start18.testservice.dto.posts.CctvSaveRequestDto;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CctvPostsService {
    private CctvRepository cctvRepository;

    @Transactional
    public Long save(CctvSaveRequestDto dto) {
        return cctvRepository.save(dto.toEntity()).getNo();
    }


    @Transactional(readOnly = true)
    public List<CctvMainResponseDto> AllDesc() {
        return cctvRepository.AllDesc()
                .map(CctvMainResponseDto::new)
                .collect(Collectors.toList());
    }
}
