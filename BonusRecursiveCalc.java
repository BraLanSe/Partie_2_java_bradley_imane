package but.sae.r201.ma_calculatrice;


/**
 *BonusRecursivite: Application de test de la recusrsivité appliquée à une calculatrice simple.
 * Example : (1 + 2) / (3 * 4)
 *
 *          /
 *        /   \
 *       +     *
 *      / \   / \
 *     1  2  3  4
 *     
 *     Le principe consiste a decomposer en token l'expression en entrée et 
 *     evaluder d'une manière recursive chaque operation binaire representée par une sous arborescence.
 *		
 *	La methode fabriqueExpression esr recursive avec comme point d'arret de la récursive la longueur de de la chaine devient nulle.
 */

public class BonusRecursivite {

	public static void main(String[] args) throws Exception {
		String s="3";
		Expression e = fabriqueExpression(s);
		System.out.println("Expression : " + s + e);
		
		s="7+3";
		e = fabriqueExpression(s);
		System.out.println("Expression:" + e);
		
		s="(6+4)/5";
		e = fabriqueExpression(s);
		System.out.println("Expression:" + e);
		
	}

	
    public static Expression fabriqueExpression (String s) throws Exception{
		   Expression e= null;
		  
		   while (s.length() >0){
			   if (isInteger(s))
				 return new Nombre(Integer.parseInt(s));
			   
				 
			   if (s.startsWith("(")){
				  int ix=s.indexOf(")");
				  Expression e1 = fabriqueExpression (s.substring(1, ix));
				  s = s.substring (ix+1, s.length());
				  if (s.length()==0)
				    return e1;
				  
				  //Rechercher opérateur
				  char operateur = s.charAt(0);
				  Expression e2 = fabriqueExpression (s.substring(0, s.length()));
				 
				  e = makeExpression (operateur, e1, e2);
				  return e;
			   }else{
				  //search for the operator + - * /
				  Expression operande1=null;
				  Expression operande2=null;
				  int position = 0;
				  
				  //retrouver l'operateur + - * ou /
				  while(position < s.length()){
					   char c = s.charAt(position);
					   
					   if (c == '+' || c == '-' || c == '*' || c == '/'){
   
						Expression e1= fabriqueExpression (s.substring(0, position));
					    
						Expression e2= fabriqueExpression (s.substring(position+1, s.length()));
						
						return  makeExpression (c, e1, e2);
					   }
					   position++;
					}// while(position < s.length()){
				}//if (s.startWith("(")){
			}//while (s.length() >0){
		   
		   return e;
		}//fabriqueExpression

	
    public static Expression makeExpression (char operator, Expression operande1, Expression operande2) throws Exception{
    	Expression e = null; 
    	switch (operator){
		   case '+':
		    e = new Addition (operande1, operande2);
			break;
		   case '-':
		     e = new Soustraction (operande1, operande2);
			 break;
		   case '*':
		      e = new Multiplication (operande1, operande2);
			  break;
		   case '/':
		      e = new Division (operande1, operande2);
			  break;
    	  }
          return e;   
    }
    
    
	public static boolean isInteger(String s) {
		  boolean bValid = false;
		   
		  try {
		   Integer.parseInt(s);
		   // s is a valid integer!
		   bValid = true;
		  } catch (NumberFormatException e) {
		   //sorry, not an integer
		   // we just move on, but you could have code here
		  }
		  return bValid;
	}
}
