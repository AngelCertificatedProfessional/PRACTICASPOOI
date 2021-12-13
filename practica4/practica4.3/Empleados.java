public class Empleados {
    private int mesIngreso;
    private int anioingreso;
    private String nombre;
    private double salariod;
    private final static int DIADEVACACIONES=10;
 
    public void setNombre(String nombre) {
        this.nombre = nombre ; 
    }

    public String getNombre(){
        return nombre;
    }

    public void setMesIngreso(int mesIngreso){
        this.mesIngreso = mesIngreso;
    }

    public int getMesIngreso(){
        return mesIngreso;
    }

    public void setAnioIngreso(int anioingreso){
        this.anioingreso = anioingreso;
    }

    public int getAnioIngreso(){
        return anioingreso;
    }

    public void setSalariod(double salarioD){
        this.salariod = salarioD;
    }

    public double getSalariod(){
        return salariod;
    }

    public double Salariosem(){
        return (salariod * 7) - ((salariod * 7) * .12); 
    }
 
    public double Primavacacional() {
        return (salariod * DIADEVACACIONES) * .25;
    }
 
    public double Aguinaldo() { 
        //aqui le quite 52 dias al 365 por la ley de un dia de descanso, ademas de 
        //los 7 dias de descanso que se le da al trabajador
        return salariod * 15;
    }
}
