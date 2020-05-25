package mashup.backend.hoowook_hoowwok.user.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RoleType {
    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");
    private final String key;
    private final String title;
}
