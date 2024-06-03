package but.sae.r201.ma_calculatrice;
/**
 * Soustraction est une classe qui offre l'opération arithmétique de soustraction de deux expressions.
 * @author imane.benazzouz bradley.landim 
 * @version 1.1
 *
 */
public class Soustraction extends Operation{		


	/**
	 * Soustraction(Nombre a, Nombre b): Constructeur par paramètre de la classe Soustraction
	 * @param a le premier operande de type Expression de l'opération de soustraction
	 * @param b le deuxième operande de  tpe Expression del'opération de soustraction
	 */
	public Soustraction(Expression a, Expression b){
		super(a,b);
	}


	/**
	 * valeur(): Effecture l'operation arithmétique de soustratction . 
	 * Elle redefinie la méthode abstraite déclarée dans la classe Expression.
	 */
	@Override
	public double valeur(){
		return getOperande1().valeur() - getOperande2().valeur();
	}
	
	/**
	 * String  toString(): Rédefinition de la méthode toString héritée par la classe Object
	 * 
	 */
	@Override
	public String  toString(){
		return  "(" + getOperande1().valeur()+ " - " +  getOperande2().valeur() + ")";
	}

}// fin classe
