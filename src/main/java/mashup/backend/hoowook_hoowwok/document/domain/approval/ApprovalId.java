package mashup.backend.hoowook_hoowwok.document.domain.approval;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class ApprovalId implements Serializable {

    private Long userId;

    private Long docId;
}
