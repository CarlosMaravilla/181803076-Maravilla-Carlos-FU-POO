
import java.util.Scanner;


public class Juegomain {
    public static void main(String[]args){
        
      /*AK bronce = new AK("bronce",5,75,5,1000,10); 
       
       System.out.println(bronce.toString()); */
       
        Scanner leer =new Scanner(System.in);
        //Creacion de nuestros personajes         
        Рersonaje p1 =new Рersonaje("Samuel");
        Рersonaje p2 =new Рersonaje("Carlos");
        
        //Menu
        System.out.println("1- Bronce");
        System.out.println("2- Plata");
        System.out.println("3- Oro");
        System.out.println("4- Diamante");
        System.out.println("5- Adamantium");
       
        System.out.println("Persenaje 1 escoja su arma");
        //seleccion del arma del personaje 1
        p1.equiparArma(leer.nextInt());
        System.out.println("Persenaje 2 escoja su arma");
        //seleccion del arma del personaje 2
        p2.equiparArma(leer.nextInt());
        
        //Imprimimos los datos del personaje 1
        System.out.println(p1.toString());
        //Imprimimos los datos del personaje 2
        System.out.println("\n"+p2.toString());
    }
    
}
