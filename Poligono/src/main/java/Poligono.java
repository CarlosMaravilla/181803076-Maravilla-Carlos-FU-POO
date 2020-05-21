import java.util.Scanner;


public class Poligono {
    public static void main(String[]args){
        double perimetro=0, apotema=0,area=0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el perimetro");
        perimetro = leer.nextDouble();
        System.out.println("ingrese el apotema");
        apotema = leer.nextDouble();
        
        area=(perimetro*apotema)/2;
        
        System.out.println("El area del poligono es "+area);
    }
}
