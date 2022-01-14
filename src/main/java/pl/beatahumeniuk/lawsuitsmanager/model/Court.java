package pl.beatahumeniuk.lawsuitsmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Court {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "court_seq")
    @SequenceGenerator(name = "court_seq", sequenceName = "court_seq", allocationSize = 1)
    private Long id;
    private String name;
    @OneToOne
    private Address address;
}
