package tn.iit.dto;

import lombok.Data;
import tn.iit.entities.Address;

@Data
public class AddressResponse {
	public AddressResponse(Address address) {
		this.id = address.getId();
		this.street = address.getStreet();
		this.city = address.getCity();
	}
	private long id;
	private String city;
	private String street;
}
