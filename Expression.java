package but.sae.r201.ma_calculatrice;
/**
 * Expression:  classe abstraite qui constitue la classe mère des sous classes concretes
 * arithmétiques tels que addaition, Soustraction,  
 * @author imane.benazzouz bradley.landim
 * @version 1.1
 */

public abstract class Expression {
	
	/**
	 * valeur(): methode abstraite qui doit redéfinie dans les classes concretes telles que Addition, Soustratction,
	 *  Multiplication et Division
	 * @return: résultat de l'expression; de type double  
	 */
	abstract public double valeur();
}
