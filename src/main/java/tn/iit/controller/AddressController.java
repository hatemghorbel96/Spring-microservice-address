package tn.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import tn.iit.dto.AddressRequest;
import tn.iit.dto.AddressResponse;
import tn.iit.service.AddressService;

@RestController
@RequestMapping("/address/api")
public class AddressController {

	
	@Value("${server.port}")
	private String serverPort;
	@Autowired
	private AddressService addressService;

	@PostMapping("/create")
	public AddressResponse createStudent(@RequestBody AddressRequest address) {
		System.out.println("******************************>"+serverPort);
		return addressService.createَAddress(address);
	}
	@GetMapping("/getById/{id}")
	public AddressResponse getAddressById(@PathVariable("id") long addressId) {
		System.out.println("******************************>"+serverPort);
		return addressService.getById(addressId);
	}

}
