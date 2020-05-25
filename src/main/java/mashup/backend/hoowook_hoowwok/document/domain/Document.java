package mashup.backend.hoowook_hoowwok.document.domain;

import lombok.*;
import mashup.backend.hoowook_hoowwok.common.BaseTimeEntity;
import mashup.backend.hoowook_hoowwok.user.domain.User;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Document extends BaseTimeEntity {
    @Id
    @Column(name="doc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long docId;

    @Column(columnDefinition = "LONGTEXT")
    private String content;

    @Column(length=100)
    private String title;

    @Column(length=6)
    private String state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @Builder
    public Document(User user, String content, String title, String state){
        this.user = user;
        this.content = content;
        this.title = title;
        this.state = state;
    }

}
