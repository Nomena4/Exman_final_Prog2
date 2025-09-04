package restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CommandeTest {
    private Plat plat1;
    private Plat plat2;
    private Commande commande;

    @BeforeEach
    void setUp() {
        var changementPrix1 = new Prix(
                5_000,"prix initial",
                Instant.parse("2025-01-01T08:00:00Z"));
        var changementPrix2 = new Prix(
                12_000, "inflation catastrophe",
                Instant.parse("2025-06-01T08:00:00Z"));

        var changementPrix3 = new Prix(
                3_000,"prix initial",
                Instant.parse("2025-01-01T08:00:00Z"));
        var changementPrix4 = new Prix(
                5_000, "inflation catastrophe",
                Instant.parse("2025-06-01T08:00:00Z"));

        plat1 = new Plat(1, "Choux fleurs", List.of(changementPrix1, changementPrix2));
        plat2 = new Plat(2, "Brocoli", List.of(changementPrix3, changementPrix4));
        commande = new Commande(1, Instant.parse("2025-02-01T08:00:00Z"), List.of(plat1, plat2));
    }
    @Test
    void getPrixTotal() {
        assertEquals(8_000, commande.getPrixTotal());

        commande = new Commande(1, Instant.parse("2025-09-01T08:00:00Z"), List.of(plat1));
        assertEquals(17_000, commande.getPrixTotal());
    }
}