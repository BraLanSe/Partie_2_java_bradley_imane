import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DivisionTest {

    private Expression operande1;
    private Expression operande2;

    @Before
    public void setUp() {
        // Configuration des opérandes avant chaque test
        operande1 = new Constante(10);  // Valeur 10 pour le premier opérande
        operande2 = new Constante(2);   // Valeur 2 pour le second opérande
    }

    @Test
    public void testDivisionValide() throws Exception {
        // Test d'une division valide
        Division division = new Division(operande1, operande2);
        assertEquals(5.0, division.valeur(), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionParZero() throws Exception {
        // Test de la division par zéro
        operande2 = new Constante(0);  // Mise à jour du diviseur à zéro
        Division division = new Division(operande1, operande2);
        division.valeur();  // Devrait lancer une ArithmeticException
    }

    @Test(expected = Exception.class)
    public void testConstructeurDivisionParZero() throws Exception {
        // Test du constructeur avec un diviseur égal à zéro
        operande2 = new Constante(0);  // Mise à jour du diviseur à zéro
        new Division(operande1, operande2);  // Devrait lancer une Exception
    }

    @Test
    public void testToString() throws Exception {
        // Test de la méthode toString
        Division division = new Division(operande1, operande2);
        assertEquals("(10.0 / 2.0)", division.toString());
    }

    @Test
    public void testDivisionNegatif() throws Exception {
        // Test d'une division négative
        operande2 = new Constante(-2);  // Diviseur négatif
        Division division = new Division(operande1, operande2);
        assertEquals(-5.0, division.valeur(), 0.001);
    }
}

