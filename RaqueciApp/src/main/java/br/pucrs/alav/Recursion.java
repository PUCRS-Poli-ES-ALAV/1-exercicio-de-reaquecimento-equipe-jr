package br.pucrs.alav;

public class Recursion {
	
	public int recur (int a1, int a2){
        if(a1<0){
            throw new IllegalAccessException("Numero negativo")}

        else if(a1==0){
            
            return 0;}

        if (a1 >= 1) {
        return a2;
    }
        return recur(a1 - 1, a2)+ a2;
  }
}
