import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

    @Test
    public void testAdditionner() {
        assertEquals(5, Calculatrice.additionner(2, 3));
    }

    @Test
    public void testSoustraire() {
        assertEquals(1, Calculatrice.soustraire(3, 2));
    }

    @Test
    public void testDiviser() {
        assertEquals(2.0, Calculatrice.diviser(6, 3));
    }

    @Test
    public void testDiviserParZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculatrice.diviser(1, 0);
        });
    }
}
