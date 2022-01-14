package pl.beatahumeniuk.lawsuitsmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.beatahumeniuk.lawsuitsmanager.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
