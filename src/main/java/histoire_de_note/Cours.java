package histoire_de_note;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@Getter

public class Cours {
    private final int id;
    private final Enseignant enseignant;
    private final LabelDeMatire LabelDeMatire;
    private List<Examen> examens;

    public double getNotesTotal(){
        var total = 0.0;
        for (Examen examen : examens){
            total += examens.get()
        }
    }
}
