package saga.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import saga.model.UserRequest;
import saga.repository.UserRequestRepository;

@Service
public class UserRequestService {
	@Autowired
	private UserRequestRepository userRequestRepository;

	
	public void addToUserRequestList(@RequestBody UserRequest userRequest) {
		userRequestRepository.save(userRequest);
	}

	public List<UserRequest> getAllFromUserRequestList(){
		List<UserRequest> userRequestList = new ArrayList<UserRequest>();
		userRequestRepository.findAll().forEach(userRequestList::add);
		return userRequestList;
	}
}
