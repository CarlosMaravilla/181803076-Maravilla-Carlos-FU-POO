
import java.util.Scanner;


public class Porcentaje {
    public static void main(String[]args){
        double alu=0,apro=0;
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el total de alumnos que presentaron el examen");
        alu = leer.nextDouble();
        System.out.println("alumnos aprobados");
        apro=leer.nextDouble();
        
        System.out.println("Alumnos reprobados "+(alu-apro));
        System.out.println("Porcentaje de reprobados "+(((alu-apro)/alu)*100)+"%");
        
      
        
        
    }
    
}
