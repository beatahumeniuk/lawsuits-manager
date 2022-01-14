package pl.beatahumeniuk.lawsuitsmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.beatahumeniuk.lawsuitsmanager.model.Respondent;

@Repository
public interface RespondentRepository extends JpaRepository<Respondent, Long> {
}
