package pl.beatahumeniuk.lawsuitsmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Representative {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "representative_seq")
    @SequenceGenerator(name = "representative_seq", sequenceName = "representative_seq", allocationSize = 1)
    private Long id;
    @Enumerated(EnumType.STRING)
    private RepresentativeTitle representativeTitle;
    private String name;
    private String surname;
    @ManyToOne
    private Office office;
}
