package Quiz.quiz.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class UserEntity {
    @Id
    private String email;
    @Column(nullable = false)
    private String password;
    private String nickname;
}
