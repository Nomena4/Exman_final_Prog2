package histoire_de_note;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class Etudiant {
    private final int id;
    private final String nom;
    private  final Date dateDeNaissance;
}
