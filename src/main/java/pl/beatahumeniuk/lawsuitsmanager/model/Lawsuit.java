package pl.beatahumeniuk.lawsuitsmanager.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lawsuit {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lawsuit_seq")
    @SequenceGenerator(name = "lawsuit_seq", sequenceName = "lawsuit_seq", allocationSize = 1)
    private Long id;
    private String signature;
    private OffsetDateTime date;
    @OneToOne
    private Court court;
    @OneToMany
    private List<Plaintiff> plaintiffs;
    @OneToOne
    private Respondent respondent;
    private String lawsuitResponse;
    @Enumerated(EnumType.STRING)
    private LawsuitCode code;
}
