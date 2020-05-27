
import java.util.Scanner;


public class Tributar {
    public static void main(String[]args){
        
        Scanner leer = new Scanner(System.in);
        
        int edad,ingresos;
        
        System.out.println("Escriba su edad");
        edad = leer.nextInt();
        System.out.println("Escribe la cantidad de sus ingresos mensuales");
        ingresos =leer.nextInt();
        
        if(edad>16 && 1000>=ingresos){
            System.out.println("Usted tiene atributar");
        }else{
            System.out.println("Usted no tiene atributar");
        }
        
    }
    
}
