package mashup.backend.hoowook_hoowwok.document.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum State {
    APPROVE("승인"),
    REJECT("거절"),
    WAIT("처리대기");

    private final String state;
}
