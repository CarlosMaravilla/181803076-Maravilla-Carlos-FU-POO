
public class AK {
    //Atributos datos o caracteristicas del objeto de manera general
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;
    double velocidadDisparo;
    
    //Metodods sona las acciones 
    public AK(String tipo, int cargador, int precision,double velocidadCarga, double precio, int danio, double velocidadDisparo ){
        
        this.tipo=tipo;
        this.cargador=cargador;
        this.precision=precision;
        this.velocidadCarga=velocidadCarga;
        this.precio=precio;
        this.danio=danio;
        this.velocidadDisparo=velocidadDisparo;
       
    }
     
    public void disparar(){
        System.out.println("Te estoy disparando"); 
    }
    
    //este metodo es para imprimir los datos de las armas 
    public String toString() {
        return "AK{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", Velocidad de Carga=" + velocidadCarga + ", precio=" + precio + ", danio=" + danio +"Velocidad de Disparo"+velocidadDisparo+'}';
    }
     
    
}
