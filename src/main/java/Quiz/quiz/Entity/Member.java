package Quiz.quiz.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    private int age;
    private String address;
}
