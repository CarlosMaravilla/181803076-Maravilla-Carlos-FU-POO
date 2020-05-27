import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[]args){
    
    Scanner leer = new Scanner(System.in);    
    
    double n;
    
        System.out.println("Ingrese un numero para obtener su valor absoluto");
        n =leer.nextDouble();
        
        if(n>0){
            System.out.println("EL valos absoluto de numero es "+n);    
        }else{
        
            System.out.println("EL valos absoluto de numero es "+n*-1);
        }
        
        
    }
    
}
