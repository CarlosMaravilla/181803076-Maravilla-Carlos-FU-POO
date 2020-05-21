import java.util.Scanner;


public class Poligono {
    public static void main(String[]args){
        double lado=0, apotema=0,area=0,n=0;

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero de lados");
        n = leer.nextDouble();       
        System.out.println("ingrese la medida del lado");
        lado = leer.nextDouble();
        System.out.println("ingrese el apotema");
        apotema = leer.nextDouble();

        area=((n*lado)*apotema)/2;

        System.out.println("El area del poligono es "+area);
    }
}