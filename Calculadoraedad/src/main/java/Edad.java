
import java.util.Scanner;


public class Edad {
    
    public static void main(String[]args){
       
        
        int anio=0,Fecha=2020;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        
        anio = leer.nextInt();
     
        
        System.out.println("Tu edad es "+(Fecha - anio));
        
    }
    
}
