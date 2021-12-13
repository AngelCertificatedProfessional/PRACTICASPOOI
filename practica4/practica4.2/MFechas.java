public class MFechas{
    public static void main(String[] args){
        Fechas fe = new Fechas();
        fe.setSegundos(Integer.parseInt(args [0]));
        System.out.println("##############################################");
        System.out.println("# Los dias son: " + fe.dias() );
        System.out.println("# Las horas son: " + fe.horas() );
        System.out.println("# Los minutos son: " + fe.minutos() );
        System.out.println("# Los segundos son: " + fe.getSegundos() ); 
        System.out.println("##############################################");
   }
}