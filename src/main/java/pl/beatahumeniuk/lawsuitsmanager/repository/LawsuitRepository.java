package pl.beatahumeniuk.lawsuitsmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.beatahumeniuk.lawsuitsmanager.model.Lawsuit;

@Repository
public interface LawsuitRepository extends JpaRepository<Lawsuit, Long> {
}
