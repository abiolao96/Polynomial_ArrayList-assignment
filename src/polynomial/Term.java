package polynomial;
import java.util.*;

public class Term {

private int coefficient;
private int exponent;

public Term ( int coefficient, int exponent){
	this.coefficient = coefficient;
	this.exponent = exponent; 
}

public int accessCoef (){
	return coefficient;
}

public int accessExpo (){
	return exponent;
}
public String toString(){
    String str = "";
    
    if (exponent  == 0){
      	str = String.valueOf(coefficient) ;
		return str; }
    
    else if (exponent == 1){
     	str = "+" + String.valueOf(coefficient) + "x" ;
		return str;	}
    
    else{
      	str = String.valueOf(coefficient) + "x^" + String.valueOf(exponent);
      	
      	if (coefficient > 0){
      		str = "+" + str;
      	}
		return str;}
    }
    
  }
