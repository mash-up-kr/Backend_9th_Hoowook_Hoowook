package mashup.backend.hoowook_hoowwok.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mashup.backend.hoowook_hoowwok.common.BaseTimeEntity;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class User extends BaseTimeEntity {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Column(length = 200)
    private String password;

    @Column(length = 15)
    private String name;

    @Column(length = 30)
    private String rank;

    @Builder
    public User(RoleType roleType, String password, String name, String rank) {
        this.roleType = roleType;
        this.password = password;
        this.name = name;
        this.rank = rank;
    }

}
