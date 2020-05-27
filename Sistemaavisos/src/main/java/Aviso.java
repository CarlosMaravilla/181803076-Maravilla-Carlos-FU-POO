
import java.util.Date;

 class Aviso {
    int matricula;
    String tipodeaviso;
    String titulo;
    String textodeaviso;
    String resumendeaviso;
    String publicador;
    String status;
    String fechapublicacion;
    String fechaalta;
    String fechabaja;
    
    
    public String toString() {
        
        return matricula+"Titulo:"+titulo+"Publicó:"+publicador+"Texto del aviso:"+textodeaviso+"Resumen:"+resumendeaviso+"Fecha de publicacion:"+fechapublicacion+"Fecha de alta:"+fechaalta+"Fecha de baja"+fechabaja+"Status"+status+"Tipo de aviso:"+tipodeaviso;
    }
    
}


