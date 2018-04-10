
package rest_api.rest_api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rest_api.rest_api.model.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    
}
