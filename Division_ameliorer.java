package but.sae.r201.ma_calculatrice;
/**
 * Division est une classe qui offre l'opération arithmétique de division de deux expressions.
 * Elle gère l'exception de division par zéro.
 * @author imane.benazzouz bradley.landim 
 * @version 1.1
 *
 */
public class Division extends Operation {

	public Division(Expression e1, Expression e2) throws Exception {
		super(e1, e2);
		if (e2.valeur() == 0){
			throw new Exception("Division par zero impossible ");
		}
	}

	
	/**
	 * int valeur (): méthode de calcule de la division de deux opérandes de type entier:
	 * Elle gère l'exception de division par zéro et leve l'exception ArithmeticException
	 * Elle retourne la valeur entière de l'opération de division
	 */
	@Override
	public double valeur(){
	
		double operande1 = getOperande1().valeur();
		double operande2 = getOperande2().valeur();
		if (operande2 == 0){
			throw new ArithmeticException("Division par zero impossible ");
		}
		
		return operande1 / operande2;
	}
	
	/**
	 * String  toString(): Rédefinition de la méthode toString héritée par la classe Object
	 * 
	 */
	@Override
	public String  toString(){
		return  "(" + getOperande1() + " / " +  getOperande2() + ")";
	}
	
	
}
