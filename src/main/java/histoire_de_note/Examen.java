package histoire_de_note;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter

public class Examen {
    private final int id;
    private final String titre;
    private final Cours coursRattache;
    private final Date dateExamen;
    private final double coefficientExamen;

}
