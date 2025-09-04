package restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PlatTest {
    private Prix prix1;
    private Prix prix2;
    private Plat plat;

    @BeforeEach
    void setUp() {
        prix1 = new Prix(
                7_000,"prix initial",
                Instant.parse("2025-01-01T08:00:00Z"));
        prix2 = new Prix(
                15_000, "inflation catastrophe",
                Instant.parse("2025-06-01T08:00:00Z"));

        plat = new Plat(1, "Bolognaise", List.of(prix1, prix2));
    }

    @Test
    void getPrix_a_un_instant_ok() {
        var prixFevrier = plat.getPrix(Instant.parse("2025-02-01T08:00:00Z"));
        var prixJuillet = plat.getPrix(Instant.parse("2025-07-01T08:00:00Z"));
        var prixJuinAvant8h = plat.getPrix(Instant.parse("2025-06-01T06:00:00Z"));

        assertEquals(7_000, prixFevrier);
        assertEquals(15_000, prixJuillet);
        assertEquals(7_000, prixJuinAvant8h);
    }
}