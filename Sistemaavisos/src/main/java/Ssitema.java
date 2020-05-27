
public class Ssitema {
    public static void main(String[] args){
        
       Aviso aviso1=new Aviso();
       
       aviso1.matricula=1;
       aviso1.titulo="insumos y bienes muebles de laboratorio disponibles";
       aviso1.publicador="Eduardo Flores Díaz";
       aviso1.textodeaviso="La Coordinación de Control Técnico de Insumos (COCTI) de la Dirección de Prestaciones Médicas, pone a disposición del personal que realiza investigación el inventario adjunto.";
       aviso1.resumendeaviso="Insumos y bienes muebles de laboratorio disponibles por la Coordinación de Control Técnico de Insumos (COCTI)";
       aviso1.fechapublicacion="02/02/2020";
       aviso1.fechaalta="02/02/2020";
       aviso1.fechabaja="02/02/2021";
       aviso1.status="Vigente";
       aviso1.tipodeaviso="General";
       
       System.out.println(aviso1.toString());
       
       Aviso aviso2=new Aviso();
       
       aviso2.matricula=2;
       aviso2.titulo="CONFERENCIA DR. COSSARIZZA";
       aviso2.publicador="Kevin Meza Gonzalez";
       aviso2.textodeaviso=":El Dr. Andrea Cossarizza, ofreció a la comunidad IMSS su conferencia “Clinical Applications of Advanced Cytometry” y aprovechó la presencia de investigadores y estudiantes del IMSS para compartir sus últimos resultados de investigación, aún no publicados, sobre VIH y el uso de citometría de flujo.\n" +
"\n" +
"Además, invitó a nuestra comunidad a agregarse a la sociedad internacional sobre citometría: ISAC(International Society for the Advancement of Cytometry) y aprovechar los recursos que tienen como:\n" +
"\n" +
"Programa de Liderazgo MARYLOU INGRAM SCHOLARS PROGRAM, de 5 años para formación de citomteristas\n" +
"Iniciativa de innovación CYTO-Innovation apoya a las propuestas innovadoras que contemplan la conversión de ideas en productos comerciales de alto impacto para ayudar a nuevos empresarios a aprovechar la tecnología de citometría\n" +
"\n" +
"Además en la ISAC tienen disponibles una serie de manuales e información de punta sobre la citometría para uso libre. El Dr. Cossarizza reiteró la invitación al personal IMSS a vincularse con la Universidad de Módena y su laboratorio aprovechando el prestigio que tiene el Laboratorio de Citometría de Flujo del Centro de Instrumentos del Centro Médico Nacional Siglo XXI.";
       aviso2.resumendeaviso="Conferencia de Dr. Andrea Cossarizza del tema “Clinical Applications of Advanced Cytometry\"";
       aviso2.fechapublicacion="02/03/2020";
       aviso2.fechaalta="02/03/2020";
       aviso2.fechabaja="31/03/2020";
       aviso2.status="No Vigente";
       aviso2.tipodeaviso="Conferencia";
       
       System.out.println(aviso1.toString());
       
       
    }
}    