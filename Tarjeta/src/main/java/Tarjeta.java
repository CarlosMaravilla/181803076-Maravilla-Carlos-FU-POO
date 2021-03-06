
public class Tarjeta {
    int nocuenta;
    int nip;
    String nombre;
    int dia;
    int mes;
    int anio;
    int cv;
    double monto;
    double apartado;
    double apartado1;
    
    //Este es nuestro metodo vacio
    public Tarjeta(){
        
    }
    //Este es nuestro metodo completo
    public Tarjeta(int nocuenta,int nip, String nombre, int dia , int mes ,int anio,int cv, double monto, double apartado,double apartado1){
        
      this.nocuenta=nocuenta;
      this.nombre=nombre;
      this.dia=dia;
      this.mes=mes;
      this.anio=anio;        
      this.cv=cv;
      this.monto=monto;
      this.apartado=apartado;
      this.apartado1=apartado1;
      
    }

    //1 public no le haremos caso
    //2 que tipo de voriable  voy a regresar (En este caso voy a regresar un objeto de tipo Tarjeta)
    //3 es el nombre del metodo
    //4 valores que recibe el metodo 
    // Este metodo verifica que la cuenta del cliente sea existente 
    public  Tarjeta verificarCuenta(int nCuenta, int NIP){
        if(nCuenta == 123123 && NIP==1133){
            
            return new Tarjeta(123123, 1133, "Eduardo Diaz Flores", 31, 12, 2032, 543,45987.22, 550,0);
            
            
        }else if(nCuenta == 456789 && NIP==3367){
            
            
            return new Tarjeta(456789, 3367, "kevin meza Gonzalez", 31, 12, 2032, 544, 360, 5322.23,0);
            
            
        }else{
           return new Tarjeta();
        }
            
        
    }
    
    public  int validar(double a){
        if(a > this.monto){
            
            return 0;
        }else{
            return 1;
            
            
       } 
        
                
    }
    
    
    //Este metodo crear el apartado 
    public void crearapartado(double apartado){
        if(this.apartado==0){
        this.monto =this.monto-apartado;
        this.apartado =this.apartado + apartado;
        }else{
        this.monto =this.monto-apartado;
        this.apartado1 =this.apartado1 + apartado;
        }
        
    }
    

  //Este metodo elemina el apartado
    public void eliminarapartado(int x){
        if(x ==1){
        this.monto =this.monto+this.apartado;
        this.apartado=this.apartado1;
        this.apartado1=0;
        }else{
        this.monto =this.monto+this.apartado1;
        this.apartado1=this.apartado1-this.apartado1;
        }       
    }
    //Este metodo realiza el deposito
   
    public void deposito(double monto){
        this.monto +=monto;
    }
    
 
    //Este metodo hace el retiro
    public void retiro(double retiro){
        this.monto =this.monto - retiro;
    }
    
    
    //Este metodo calcula el total de la ceunta
    public double Total(){
        
        return this.monto + this.apartado + this.apartado1;
    }
    
    //Este metodo imprime los datos de la cuenta
    @Override
    public String toString() {
        return "\n nocuenta:" + nocuenta + "\n nombre:" + nombre + "\n Fecha:"+ dia + "/" + mes + "/" + anio + "\n cv:" + cv + "\n monto:" + monto + "\n apartado:" + apartado+"\n Segundo apartado:"+apartado1+"\nTotal:"+this.Total();
    }


   
    
}
