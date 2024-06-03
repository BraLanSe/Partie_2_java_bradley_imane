package but.sae.r201.ma_calculatrice;
/**
 * class Operation: Classe abstraite qui heite de la classe mère Expression  déclarant les operandes de l'expression
 * @author imane.benazzouz bradley.landim
 * @version 1.1
 *
 */
public abstract class Operation extends Expression {
	
	/**
	 * operande1 et operande2 définissent les deux opérandes de l'opération arithmétique.
	 * ils sont de type Expression.
	 * 	 
	 */
	private Expression operande1;
	private Expression operande2;
	

	/** 
	 * Constructeur de la classe Operation
	 * @param e1: Operande 1 de type Expression
	 * @param e2: Operande 2 de type Expression
	 */
	public Operation(Expression e1, Expression e2) {
		this.operande1 = e1;
		this.operande2 = e2;
	}

	
	/**
	 *  getOperande1: Getter de l'operande1
	 * @return: Operande1 de type Expression
	 */

	public Expression getOperande1() {
		return operande1;
	}
	
	/**
	 * setOperande1: Setter pour initialiser l'attribut operande1
	 * @param operande1: Paramètre de type Expression servant à initialiser l'attribut operande&
	 */
	public void setOperande1(Expression operande1) {
		this.operande1 = operande1;
	}

	/**
	 *  getOperande2: Getter de l'operande2
	 * @return: Operande2 de type Expression
	 */
	public Expression getOperande2() {
		return operande2;
	}

	/**
	 * setOperande2: Setter pour initialiser l'attribut operande2
	 * @param operande2: Paramètre de type Expression servant à initialiser l'attribut operande2
	 */
	public void setOperande2(Expression operande2) {
		this.operande2 = operande2;
	}
	
	


}
