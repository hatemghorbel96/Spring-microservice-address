package tn.iit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.iit.dto.AddressRequest;
import tn.iit.dto.AddressResponse;
import tn.iit.entities.Address;
import tn.iit.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepo;

	public AddressResponse createَAddress(AddressRequest addressRequest) {
		Address address = new Address(0, addressRequest.getCity(), addressRequest.getStreet());
		address = addressRepo.save(address);
		return new AddressResponse(address);

	}

	public AddressResponse getById(long addressId) {
		Optional<Address> adr = addressRepo.findById(addressId);
		return new AddressResponse(adr.get());
	}
}
