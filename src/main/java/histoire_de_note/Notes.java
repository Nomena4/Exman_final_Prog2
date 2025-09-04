package histoire_de_note;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter

public class Notes {
    private final Etudiant etudiant;
    private final double note;
    private final Date date;
    private final List<Examen> examens;

    public double getExamen(Instant t){
        return examens.stream()
                .filter(examen -> examen.getDateExamen().toInstant().isBefore(t))
                .max(Comparator.comparing(Examen::getDateExamen))
                .map(Examen::getCoefficientExamen)
                .get();

    }
}
