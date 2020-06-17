
public class Рersonaje {
    //atributos de la claae personaje 
    int vida;
    String nombre;
    AK arma;
    
    //con este metodo le signamos la cantidad de vida a nuestro personaje 
    public Рersonaje(){
        this.vida=100;
    }
    //este metodo le asignamos nombre a nuestro personaje 
    public Рersonaje(String nombre){
        this();
        this.nombre=nombre;
        
    }
    //con este metodo creamos nuestra arma,dependiendo de la que haya elegido el jugador
    public void equiparArma(int valor){
        
        switch(valor){
        case 1:   
              this.arma = new AK("Bronce",5,75,5,1000,10,10);
              break;
        case 2:
              this.arma =new AK("Plata",8,70,4.5,2300,11,9.8);
              break;
        case 3:
              this.arma =new AK("Oro",10,85,4.3,2500,13,9.7);
              break;
        case 4:      
             this.arma =new AK("Diamante",20,95,4.3,2500,13,9.7);
             break;
        case 5:
             this.arma =new AK("Adamantium",30,100,1,1000,27,8);
             break;
        default:
            System.out.println("error:numero de arma no correspondiente");
            break;
        }
    }
    
    public String dispararArma(){
        return "daño:"+arma.danio;
    }

    @Override
    //Este metod imprimelos datos del personaje 
    public String toString() {
        return "Personaje{" + "vida=" + vida + ", nombre=" + nombre + ", arma=" + arma + '}';
    }
    
    
}
