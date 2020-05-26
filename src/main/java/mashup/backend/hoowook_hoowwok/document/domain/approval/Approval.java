package mashup.backend.hoowook_hoowwok.document.domain.approval;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mashup.backend.hoowook_hoowwok.common.BaseTimeEntity;
import mashup.backend.hoowook_hoowwok.document.domain.State;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Approval extends BaseTimeEntity {

    @EmbeddedId
    private ApprovalId approvalId;

    @Column
    private Integer ordering;

    @Enumerated(EnumType.STRING)
    private State state;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @Builder
    private Approval(ApprovalId approvalId, Integer ordering, State state){
        this.approvalId = approvalId;
        this.ordering = ordering;
        this.state = state;
    }

}
