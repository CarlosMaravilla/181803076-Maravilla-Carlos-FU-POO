
import java.util.Scanner;


public class Triangulo {
    public static void main(String[]args){
      
        Scanner leer=new Scanner(System.in);  
        int n;
        
        System.out.println("Ingrese la longitud del trianfgulo");
        n = leer.nextInt();          
 
        for(int i=1;i<=n;i=i+1)
        {
           
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

 }

