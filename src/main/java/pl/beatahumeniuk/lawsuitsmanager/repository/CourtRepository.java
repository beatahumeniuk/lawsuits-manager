package pl.beatahumeniuk.lawsuitsmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.beatahumeniuk.lawsuitsmanager.model.Court;

@Repository
public interface CourtRepository extends JpaRepository<Court, Long> {
}
