public class Calculatrice {

    /**
     * Divise deux nombres.
     * 
     * @param a Le dividende.
     * @param b Le diviseur.
     * @return Le résultat de la division.
     * @throws ArithmeticException Si le diviseur est zéro.
     */
    public static double diviser(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return a / b;
    }
    
    /**
     * Additionne deux nombres.
     * 
     * @param a Le premier nombre.
     * @param b Le deuxième nombre.
     * @return La somme des deux nombres.
     */
    public static double additionner(double a, double b) {
        return a + b;
    }
    
    /**
     * Soustrait deux nombres.
     * 
     * @param a Le premier nombre.
     * @param b Le deuxième nombre.
     * @return La différence des deux nombres.
     */
    public static double soustraire(double a, double b) {
        return a - b;
    }
}
