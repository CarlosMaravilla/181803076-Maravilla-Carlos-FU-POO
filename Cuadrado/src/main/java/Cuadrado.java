import java.util.Scanner;


public class Cuadrado {
    public static void main(String[]args){
        
        double L1 = 0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida del lado del cuadrado");
        
         L1 = leer.nextDouble();
        
        System.out.println("El area es "+(L1*L1));
        
        
        
        
    }
    
    
}
