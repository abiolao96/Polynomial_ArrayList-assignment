package polynomial;
import java.util.*;
import polynomial.Term;

public class polynomial {
	private ArrayList<Term> arr;
	
	public polynomial(){
		arr = new ArrayList<Term> ();
	}
	
	public void insert (int coeff, int expo){
		Term temp = new Term(coeff, expo);
		
		for (int i = 0; i < arr.size(); i++){
			if (arr.get(i).accessExpo() < temp.accessExpo()){
				arr.add(i,temp);
				return;}
		}
		arr.add(temp);
		return;}
	
	public ArrayList<Term> reverse(){
		ArrayList<Term> arr2 = new ArrayList<Term>(); 
		for (int i = arr.size() - 1; i >= 0; i-- ){
			arr2.add(arr.get(i));}
		return arr2;}
	
	public String product(){
		String str = "";
		for (int i = 0; i < arr.size(); i++){
			str += arr.get(i).toString();}
		return str;}
	
	public void delete(int coef, int expo){
		for (int i = 0; i < arr.size(); i++){
			if ((coef == arr.get(i).accessCoef()) && (expo == arr.get(i).accessExpo())){
				arr.remove(i);
				return;
			}	
		}
		return;
	}
	
}
	

