import java.util.Scanner;
import java.text.*;
import java.util.*;
public class Agenda {
    private String fechaIn;
    private String fecha;
    private String agenda;
   	
    public void setAgenda(String agenda){
        this.agenda= agenda; 
    }
    public void setFechaIn(String fechaIn){
        this.fechaIn = fechaIn;
    }
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }
    public boolean validar(String fechaIn) {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yy");
        Date fecha01 = df.parse(fechaIn, new ParsePosition(0));
        Date fecha02 = df.parse(fecha, new ParsePosition(0));   
        try {
            df.setLenient(false);
            df.parse(fechaIn);
            if(fecha01.after(fecha02)){
                return true;
            } else{
                System.out.println("La fecha que se a registrado es menor a la actual: " + fecha); 
                return false; 
            }
        } 
        catch (ParseException e) {
            System.out.println("La fecha que a introducido es falsa");    
            return false;        
        } 
    }
    public void mostrar(){
        if(agenda!="") {
            System.out.println("El pendiente que se tiene en registro es:"+fechaIn);
            System.out.println("El pendiente que se a registrado es:" + agenda); 
        }else{
            System.out.println("No se a agendado nada"); 
        }
    }
    public String getAgenda(){
        return agenda; 
    }
    
    public String getFechaIn() {
        return fechaIn;
    }
    
    public String getFecha(){
        return fecha;
    }
}
