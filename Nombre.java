package but.sae.r201.ma_calculatrice;

/**
 * Nombre est une classe qui herite de la classe mère Expression elle encapsule la valeur entiere valeurNombre
 * @author imane.benazzouz bradley.landim 
 * @version 1.1
 */
public class Nombre extends Expression {
	/**
	 * valeurNombre: désigne la valeur entiere encapsulé dans la classe Nombre
	 */
	private int valeurNombre;

	/**
	 * Nombre(): Constructeur par défaut qui initialise la valeurNombre à zéro.
	 */
	public Nombre() {
		this.valeurNombre = 0;
	}
	
	/**
	 * Nombre(int uneValeur): Constructeur avec paramètre  de la classe Nombre avec une valeur entière
	 * @param uneValeur
	 */
	public Nombre(int uneValeur) {
		this.valeurNombre = uneValeur;
	}
	
	/**
	 * Nombre(Nombre uneValeur): Constructeur par copie de la classe Nombre 
	 * @param uneValeur
	 */
	public Nombre(Nombre uneValeur) {
		this.valeurNombre = uneValeur.getValeurNombre();
	}

	/**
	 * getValeurNombre(): Getter de l'attribut valeurNombre
	 * @return: valeurNombre attribut de la classe Nombre
	 */
	public int getValeurNombre() {
		return valeurNombre;
	}

	/**
	 * setValeurNombre(int valeurNombre): Setter de l'attribut valeurNombre
	 * @param valeurNombre: paramètre pour initialiser l'attribut valeurNombre
	 */
	public void setValeurNombre(int valeurNombre) {
		this.valeurNombre = valeurNombre;
	}

	@Override
	public double valeur() {
		return this.valeurNombre;
	}
	
	@Override
	/**
	 * toString(): Redéfinie la méthode toString() héritée de Object
	 * @return: Une chaine de caracatère décirant une instance de la classe Nombre
	 */
	public String toString(){
		return "" + this.valeurNombre ;
	}
	
}
