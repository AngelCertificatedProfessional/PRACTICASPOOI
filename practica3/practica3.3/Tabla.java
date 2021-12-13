public class Tabla {
    public void ciclo (int numero) {
        for(int k=1;k<13;k++) {
            System.out.println(numero + " * " + k + " = " + numero*k);
        }
   }
    public static void main (String[] args)
    {
        Tabla tabla = new Tabla();
        tabla.ciclo(7);
    } 
}