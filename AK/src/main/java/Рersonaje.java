
public class Рersonaje {
    
    
    int vida;
    String nombre;
    AK arma;
    
    
    public Рersonaje(){
        this.vida=100;
    }
    
    public Рersonaje(String nombre){
        this();
        this.nombre=nombre;
        
    }
    
    public void equiparArma(){
        this.arma = new AK("bronce",5,75,5,1000,10,10);
    }

    @Override
    public String toString() {
        return "\u0420ersonaje{" + "vida=" + vida + ", nombre=" + nombre + ", arma=" + arma + '}';
    }
    
    

}
