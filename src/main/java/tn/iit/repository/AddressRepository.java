package tn.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iit.entities.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	

}
