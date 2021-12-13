public class Fechas {
    private int dias=0;
    private int horas=0;
    private int minutos=0;
    private int segundos=0;
    
    public int dias() {
    //dias
        if(segundos >= 86400) {
            while (segundos>=86400) {
                segundos= segundos -86400; 
                dias++;
            } 
        }
        return dias;
    }
   
    public int horas(){
    //horas
        if(segundos >= 3600){
            while(segundos>=3600){
                segundos=segundos-3600;
                horas++;
            }
        }
        return horas;
    }
    
    public int minutos(){
    //minutos
        if(segundos >= 60){
            while(segundos>=60){
                segundos=segundos-60; 
                minutos++; 
            } 
        }
        return minutos; 
    }
    
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }
    public int getSegundos(){
        return segundos;
    }
}