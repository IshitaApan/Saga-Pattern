package saga.repository;

import org.springframework.data.repository.CrudRepository;

import saga.model.UserRequest;

public interface UserRequestRepository extends CrudRepository<UserRequest, Long> {

}
