public class Temperatura {
    public int grados;
    public double aCentigrados() {
        // C=5/9 (F-32)
        double c = (double) 5/9 * (grados-32);
        return c;
    }
    public double aFarenheit() {
        //F=9/5 C +32.
        double f = 9/5.0 * grados + 32;
        return f ;
   }
}