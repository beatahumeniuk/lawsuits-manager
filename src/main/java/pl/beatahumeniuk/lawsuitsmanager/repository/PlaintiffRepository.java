package pl.beatahumeniuk.lawsuitsmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.beatahumeniuk.lawsuitsmanager.model.Plaintiff;

@Repository
public interface PlaintiffRepository extends JpaRepository<Plaintiff, Long> {
}
