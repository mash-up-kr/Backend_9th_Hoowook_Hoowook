package mashup.backend.hoowook_hoowwok.approval.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mashup.backend.hoowook_hoowwok.common.BaseTimeEntity;
import mashup.backend.hoowook_hoowwok.document.domain.Document;
import mashup.backend.hoowook_hoowwok.user.domain.User;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Approval extends BaseTimeEntity {

    @EmbeddedId
    private ApprovalId approvalId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @MapsId("userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "doc_id")
    @MapsId("docId")
    private Document document;

    @Column
    private Integer ordering;

    @Column(length = 6)
    private String state;

    @Builder
    private Approval(ApprovalId approvalId, Integer ordering, String state){
        this.approvalId = approvalId;
        this.ordering = ordering;
        this.state = state;
    }

}
