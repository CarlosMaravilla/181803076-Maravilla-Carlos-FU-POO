
import java.util.Scanner;


public class Maintarjeta {
    
    public static void main(String[] args){
       
        double retiro;
        int n=0,x=0;
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
       
        if(tarjeta.nombre != null){
        do{
        System.out.println("\n"+tarjeta.nombre);
        System.out.println((n+1)+". Hacer un deposito");
        System.out.println((n+2)+". Hacer un retiro");   
        if(tarjeta.apartado!=0 || tarjeta.apartado1!=0 ){
            System.out.println((n+3)+". Eliminar apartado");
        }else{
              n=n-1;          
        }
        if(tarjeta.apartado == 0 || tarjeta.apartado1 ==0 ){
            System.out.println((n+4)+". Crear apartado");
        }else{
            n=n-1;
        }
        System.out.println((n+5)+". Imprimir datos de la cuenta");
        System.out.println((n+6)+". Salir");
        System.out.println("Elagir una opcion");
        opcion = leer.nextInt();
        if(tarjeta.apartado != 0 && tarjeta.apartado1 != 0){
           if(opcion > 3){
             opcion = opcion+1;  
           } 
        }  
        if(tarjeta.apartado == 0 && tarjeta.apartado1 ==0 ){
            if(opcion>=3){
                opcion = opcion+1;
                
            }
        }
        
        
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
                   System.out.println("Ahora su cuenta tiene: $"+tarjeta.monto);
                }
                
                break;
            case 3:
                if(tarjeta.apartado!=0 && tarjeta.apartado1!=0 ){
                    System.out.println("Que apartado quiere eliminar");
                    System.out.println("Primero de "+tarjeta.apartado+"  (1)");
                    System.out.println("Segundo de "+tarjeta.apartado1+" (2)");
                    x=leer.nextInt();
                    tarjeta.eliminarapartado(x);
                    
                    if(x == 1){
                        System.out.println("Usted elimino su primer apartado");
                        System.out.println("Ahora cuenta con "+tarjeta.monto+" de monto y "+tarjeta.apartado+" de apartado");
                    }else{
                        System.out.println("Usted elimino su segundo apartado");
                        System.out.println("Ahora cuenta con "+tarjeta.monto+" de monto y "+tarjeta.apartado+" de apartado");     
                    }                         
        
                }else{
                    System.out.println("Usted elimino su apartado");
                    tarjeta.eliminarapartado(1);
                    System.out.println("Ahora cuenta con "+tarjeta.monto+" de monto ");
                }
                break;
            case 4:
              
                    System.out.println("Usted cuenta con "+tarjeta.monto+" en su cuenta");
                    System.out.println("¿Cuanto desea apartar?");
                    retiro=leer.nextDouble();
                    
                    if(tarjeta.validar(retiro)== 0){
                    
                    System.out.println("Monto insuficiente");
                    }else{         
                   
                       if(tarjeta.apartado == 0){
                          tarjeta.crearapartado(retiro);
                          System.out.println("Se ha creado correctamente el apartado");
                          System.out.println("Ahora su cuenta tiene $"+tarjeta.monto+" de monto y "+tarjeta.apartado+" de apartado");
                       }else{
                           tarjeta.crearapartado(retiro);
                           System.out.println("llega");
                           System.out.println("Se ha creado correctamente  apartado");
                           System.out.println("Ahora su cuenta tiene $"+tarjeta.monto+" de monto, "+tarjeta.apartado+" del primer apartado y "+tarjeta.apartado1+" del segundo apartado:");
                       }
                    
                    
                    }                 
                break;           
                
            case 5:    
                System.out.println(tarjeta.toString());
                break;            
            case 6:
                opcion=6;
                break;
            default:
                System.out.println("La opcion no existe");
        
        }
        n=0;
        }while(opcion != 6);
        }else{
            System.out.println("La cuenta no existe");
        }

    }
}
 