package br.pucrs.alav;

public class Recursion {
    public static void main(string args) {
     	System.out.println(multiNaturais(6,4));
      
    }

    public int multiNaturais(int value; int repeat){

        if (repeat==0){
            return;
        }
        return value+multiNaturais(value,repeat-1);
    }
    /*
    public int somaNaturais(){}

    public int somaMeio(){}

    public int inverteString(){}
    
    public int geraSequencia(){}

    public int sequenciaAckerman(){}

    public int somaProdutoVetor(){}

    public boolean palindromo(){}

    public List<string> combinaPalavra(){}
     
    public List<int> fibonati(){}
    */
	
}
