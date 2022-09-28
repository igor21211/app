package tryCoding.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tryCoding.app.domain.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
