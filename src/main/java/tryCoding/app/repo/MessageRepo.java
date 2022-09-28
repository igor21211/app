package tryCoding.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tryCoding.app.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
