package mashup.backend.hoowook_hoowwok.document.domain.document;

import lombok.*;
import mashup.backend.hoowook_hoowwok.common.BaseTimeEntity;
import mashup.backend.hoowook_hoowwok.document.domain.State;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Document extends BaseTimeEntity {
    @Id
    @Column(name="doc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long docId;

    @Column(columnDefinition = "LONGTEXT")
    private String content;

    @Column(length=100)
    private String title;

    @Enumerated(EnumType.STRING)
    private State state;

    private Long userId;

    @Builder
    private Document(Long userId, String content, String title, State state){
        this.userId = userId;
        this.content = content;
        this.title = title;
        this.state = state;
    }

}
