package Quiz.quiz.repository;

import Quiz.quiz.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}
