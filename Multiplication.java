package but.sae.r201.ma_calculatrice;

/**
 * Multiplication est une classe qui offre l'opération arithmétique de multiplication de deux expressions.
 * La classe Multiplication hérite de la classe abstraite Operation
 * @author imane.benazzouz bradley.landim 
 * @version 1.1
 *
 */
public class Multiplication extends Operation {

	/**
	 * Multiplication(Expression e1, Expression e2): Constructeur avec paramètres de la classe Multiplication 
	 * @param e1: Operande 1 de l'expression de multiplication
	 * @param e2: Operande 2 de l'expression de multiplication
	 */
	public Multiplication(Expression e1, Expression e2) {
		super(e1, e2);
	}

	/**
	 * valeur(): Effecture l'operation arithmétique de multiplication. 
	 * Elle redefinie la méthode abstraite déclarée dans la classe Expression.
	 */
	@Override
	public double valeur() {
		return getOperande1().valeur() *  getOperande2().valeur();
	}

	/**
	 * String  toString(): Rédefinition de la méthode toString héritée par la classe Object
	 * 
	 */
	@Override
	public String  toString(){
		return  "(" + getOperande1().valeur()+ " * " +  getOperande2().valeur() + ")";
	}
	
}
