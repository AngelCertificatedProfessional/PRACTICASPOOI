public class MTemperatura {
    public static void main (String [] args){
        Temperatura t = new Temperatura();
        t.grados= Integer.parseInt(args[0]);
        char opcion = args[1].charAt(0); // c o f segun sean los grados capturados
        if (opcion == 'f'){
            double c =t.aCentigrados();
            System.out.println(t.grados+"F = " + c + "C");
        }
        if(opcion == 'c') {
            double f=t.aFarenheit();
            System.out.println(t.grados+"C = " + f + "F"); 
        }
    }
}