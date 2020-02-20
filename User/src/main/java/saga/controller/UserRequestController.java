package saga.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import saga.model.UserRequest;
import saga.service.UserRequestService;

@RestController
public class UserRequestController {
	@Autowired
	private UserRequestService userRequestService;
	
	@RequestMapping(method=RequestMethod.POST, value = "/requestTransaction")
	public void addToUserRequestList(@RequestBody UserRequest userRequest) {
		userRequestService.addToUserRequestList(userRequest);
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/requestTransaction")
	public  String x() {
		return "sasasa";
	}
//	@RequestMapping(value = "/insertemployee", method = RequestMethod.POST)
	/*List<UserRequest> getAllFromUserRequestList(){
		return userRequestService.getAllFromUserRequestList();
	}*/
	

}
