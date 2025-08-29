package Quiz.quiz.repository;

import Quiz.quiz.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    Optional<UserEntity> findById(String id);

    Optional<UserEntity> findById(String password, String id);

    List<UserEntity> findByStatusTrue();

    List<UserEntity> findByStatusFalse();

    List<UserEntity> findByAnswerTrueGreaterThan(int count);

    Optional<UserEntity> findByStatusTrueAndId(
    String id);
}
