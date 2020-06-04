
import java.util.Scanner;


public class Maintarjeta {
    
    public static void main(String[] args){
       
        double retiro;
        //Avisando al programa que usare un objeto tajeta 
        Tarjeta tarjeta;
        
        Scanner leer = new  Scanner(System.in);
        int nCuenta,NIP,opcion;
      
        System.out.println("Numero de cuenta");
        nCuenta =leer.nextInt();
        System.out.println("NIP");
        NIP =leer.nextInt();
        //Instaciando y llamando el metodo verificar cuenta. 
        tarjeta=new Tarjeta().verificarCuenta(nCuenta,NIP);
        
        do{
        System.out.println("\n"+tarjeta.nombre);
        System.out.println("1. Hacer un deposito");
        System.out.println("2. Hacer un retiro");   
        if(tarjeta.apartado!=0){
           System.out.println("3. Eliminar apartado");
        }else{
            System.out.println("3. Crear apartado");
        }
        System.out.println("4. Imprimir datos de la cuenta");
        System.out.println("5. Salir");
        System.out.println("Elagir una opcion");
        opcion = leer.nextInt();
      
        
        switch (opcion)
        {
            case 1:
                System.out.println("Ingrese la cantidad a depositar a la cuenta "+tarjeta.nocuenta);
                tarjeta.deposito(leer.nextDouble());   
                System.out.println("Ahora su cuenta tiene: $"+tarjeta.monto);
                break;
            
            case 2:
                System.out.println("Ingrese la cantidad  a retirar de la cuenta "+tarjeta.nocuenta);
                retiro=leer.nextDouble(); 
                tarjeta.validar(retiro); 
                if(tarjeta.validar(retiro)==0){
                    System.out.println("Monto insuficiente");
                }else{
                   tarjeta.retiro(retiro);
                }
                System.out.println("Ahora su cuenta tiene: $"+tarjeta.monto);
                break;
            case 3:
                if(tarjeta.apartado!=0 ){
                    System.out.println("Usted elimino su apartado");
                    tarjeta.eliminarapartado();
                    System.out.println("Ahora su cuenta tiene: $"+tarjeta.monto); 
                }else{
                    
                    System.out.println("Usted cuenta con "+tarjeta.monto+" en su cuenta");
                    System.out.println("¿Cuanto desea apartar?");
                    retiro=leer.nextDouble();
                    if(tarjeta.validar(retiro)==0){
                    System.out.println("Monto insuficiente");
                    }else{
                   
                   
                    tarjeta.crearapartado(leer.nextDouble());
                    System.out.println("Se ha creado correctamente su apartado");
                    System.out.println("Ahora su cuenta tiene $"+tarjeta.monto+" y "+tarjeta.apartado+" de apartado");
                    
                    }
                    
                }
                break;
            case 4:
                System.out.println(tarjeta.toString());
                break;
            case 5:
                opcion=5;
                break;
            default:
                System.out.println("ERROR");
        
        }
        }while(opcion != 5);
        

    }
}
 