package pl.beatahumeniuk.lawsuitsmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plaintiff {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plaintiff_seq")
    @SequenceGenerator(name = "plaintiff_seq", sequenceName = "plaintiff_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String surname;
    @OneToOne
    private Representative representative;
}
