package Quiz.quiz.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false)
    private String email;

    @Column(nullable = false)
    private String password;
    private String nickname;

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private int answerTrue = 0;

    @Column(nullable = false)
    private int answerFalse = 0;
    
}
