
public class JuegoMain {
    public static void main(String[] args){
         AK bronce = new AK();
         bronce.tipo = "Bronce";
         bronce.cargador=5;
         bronce.precision=75;
         bronce.velocidadCarga=5;
         bronce.precio=1000;
         bronce.danio=10;
         bronce.velocidadDisparo=10;
         System.out.println(bronce.toString());
         System.out.println(bronce.disparar());
         
         AK plata=new AK();
         
         
         plata.tipo="Plata";
         plata.cargador=8;
         plata.precision=70;
         plata.velocidadCarga=4.5;
         plata.precio=2300;
         plata.danio=11;
         plata.velocidadDisparo=9.8;
         System.out.println(plata.toString());
         
         AK oro=new AK();
         oro.tipo="Oro";
         oro.cargador=10;
         oro.precision=85;
         oro.velocidadCarga=4.3;
         oro.precio=2500;
         oro.danio=13;
         oro.velocidadDisparo=9.7;
         System.out.println(oro.toString());
         
         AK diamante=new AK();
         diamante.tipo="Diamante";
         diamante.cargador=20;
         diamante.precision=95;
         diamante.velocidadCarga=3;
         diamante.precio=4000;
         diamante.danio=20;
         diamante.velocidadDisparo=9.4;
         System.out.println(diamante.toString());
         
         AK adamantium=new AK();
         adamantium.tipo="Adamantium";
         adamantium.cargador=30;
         adamantium.precision=100;
         adamantium.velocidadCarga=1;
         adamantium.precio=10000;
         adamantium.danio=27;
         adamantium.velocidadDisparo=8;
         System.out.println(adamantium.toString());
         
         
   
       
     }
}
