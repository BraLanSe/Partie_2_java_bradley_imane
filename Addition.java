package but.sae.r201.ma_calculatrice;

/**
 * Addition est une classe qui offre l'opération arithmétique d'addition de deux expressions.
 * @author imane.benazzouz bradley.landim 
 * @version 1.1
 *
 */
public class Addition extends Operation{		

	/**
	 * Addition(Nombre a, Nombre b): Constructeur par paramètre de la classe Addition
	 * @param a le premier operande de l'opération addition
	 * @param b le deuxième operande de l'opération addition
	 */
	
	public Addition(Expression a, Expression b){
		super(a,b);
	}
	

	/**
	 *  int valeur(): Effectue l'opération d'addition de deux opérandes
	 */
	public double valeur(){
		return getOperande1().valeur() +  getOperande2().valeur();
	}

	/**
	 * String  toString(): Représente en format chaine de caractrères l'instance de la classe Addition
	 */
	public String  toString(){
		return  "(" + getOperande1().valeur() + " + " +  getOperande2().valeur() + ")";
	}

}// fin classe
