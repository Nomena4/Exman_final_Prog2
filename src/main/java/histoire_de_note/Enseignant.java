package histoire_de_note;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter

public class Enseignant {
    private final int id;
    private final String nom;
    private final String prenom;
    private final Date dateNaissance;
    private final String email;
    private final String telephone;
    private final Specialite specialite;
}
