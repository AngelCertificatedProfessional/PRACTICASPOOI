public class Menu {
    public static void main(String... args) {
        for(int x=0;x<args.length;x++){
            System.out.println("El resultado es: "+ Ecuaciones.numero(Integer.parseInt(args[x]))); 
        }  
    }
}