package tn.esprit.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;

    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;

    @ManyToMany(mappedBy = "skieurs")
    private List<Piste> pistes;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "numAbon") // Foreign key in Skieur table pointing to Abonnement
    private Abonnement abonnement;
}
