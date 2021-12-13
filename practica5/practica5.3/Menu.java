import java.util.Scanner;
import java.text.*;
import java.util.*;
public class Menu {
    public static void main(String[] args) {
 	    Scanner scanf = new Scanner(System.in);
        Agenda ag2 =new Agenda();
        SimpleDateFormat sdf = new SimpleDateFormat ("MM/dd/yy"); 
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT); //convierto el valor a fecha 4/23/13
	    ag2.setFecha(df2.format(new Date())); //lo paso a ag.feac
        int opc;
 	    do{
	        System.out.println("Bienvenido al menu de agenda");	
	        System.out.println("1.Apuntar un pendiente");	
	        System.out.println("2.Mostar pendientes de agenda");
 	        System.out.println("3.Salida");
            System.out.println("Que desea hacer:");
	        opc=scanf.nextInt();
   	        switch(opc){
 	            case 1:
                    System.out.println("Escriba por favor la fecha que desea agendar:");
                    System.out.println("Ejemplo: \"MM/dd/yy\" :" );
                    ag2.setFechaIn(scanf.nextLine());
                    ag2.setFechaIn(scanf.nextLine());
                if(ag2.validar(ag2.getFechaIn())) {
                    System.out.println("Escriba que desea hacer en la fecha " + ag2.getFechaIn() + ": ");
	                ag2.setAgenda(scanf.nextLine()); 
                }else{
                    System.out.println("Fecha Incorrecta");
                }
      	        break;          
 	            case 2:
	                ag2.mostrar();
 	            break;
                case 3:
                    System.out.println("Salida");
 	            break;
                default:
    	            System.out.println("Error al introducir datos");
            }
        }while(opc!=3);
	}
}