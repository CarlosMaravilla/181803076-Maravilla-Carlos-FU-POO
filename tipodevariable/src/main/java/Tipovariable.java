import java.util.*;
import java.util.Scanner;



public class Tipovariable {
    public static void main(String[]args){
        //
        /*
        Fuertemente tipado
           Debemos declarar el tipo de variable que es y esta siempre  enel programa matendra ese tipo
                una variable no puede facilmente a ser otro tipo 
               Castear el convertir una variable de un tipo a otro
        */
        
        //tipos numericos 
        int a=10,b=2;
        //Operaciones 
        System.out.println(a+b);
        System.out.println(a-b);        
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        
        float pi=3.14f;
        double pi2=2.14;
        //cambios de variables 
        boolean bandera =true;
        
        //Ingresar caracteres
        char letra='a';
        
        String palabra="Puedes poner un mensaje largo";
        System.out.println(palabra);
        System.out.println(palabra+"Esta es una prueba de ello");
        
        System.out.println("Este es el valor de pi"+pi);
        
        System.out.println("Este es el valor del circulo"+pi*a);
        System.out.println(pi+a+"Este es el valor del circulo");
        
        
     
    }   
}
