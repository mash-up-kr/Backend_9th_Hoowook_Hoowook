package mashup.backend.hoowook_hoowwok.approval.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import mashup.backend.hoowook_hoowwok.document.domain.Document;
import mashup.backend.hoowook_hoowwok.user.domain.User;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class ApprovalId implements Serializable {

    private Long userId;

    private Long docId;
}
