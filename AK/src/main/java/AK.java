
public class AK {
    //atributos del objeto de manera general
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;
    double velocidadDisparo;
    
    //Constructor con parametro 
    public AK(String tipo){
        this.tipo=tipo;    
    }
    //Constructor vacio
    public AK(){
        
    }
    
    
    public AK(String tipo, int cargador, int precision,double velocidadCarga, double precio, int danio, double velocidadDisparo  ){
        
        this.tipo=tipo;
        this.cargador=cargador;
        this.precision=precision;
        this.velocidadCarga=velocidadCarga;
        this.precio=precio;
        this.danio=danio;
        this.velocidadDisparo=velocidadDisparo;
    }
    
    
    //acciones-metodos, son las acciones o iteraciones del objeto
    public String disparar(){
        return "Te estoy disparando con un daño de"+danio+"pts";
    }
    public void apuntar(){}
    public void recargar(){}
    
//metodo de finido 
    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + "\n cargador=" + cargador + "\n precision=" + precision + "\n velocidadCarga=" + velocidadCarga + "\n precio=" + precio + "\n danio=" + danio + "\n velocidadDisparo=" + velocidadDisparo + '}';
    }
}
