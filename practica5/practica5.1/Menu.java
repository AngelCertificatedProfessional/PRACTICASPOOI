import java.util.Scanner;
public class Menu{
    public static void main(String[] args){ 
        int opcion=0;
        Scanner scanf = new Scanner(System.in);
        do{
            System.out.println("Bienvenido al menu de opciones del figuras");
            System.out.println("1.Rectangulo");
            System.out.println("2.Pentagono");
            System.out.println("3.Salida");
            System.out.print("Que opcion deseas acceder:");
            opcion=scanf.nextInt();
            //scanf.skip("\n");
            switch(opcion){
                case 1: 
                    Rectangulos rec = new Rectangulos();
                    rec.dibujarRectangulo();
                break;
                case 2:
                    Pentagonos pol = new Pentagonos();
                    pol.dibujarPentagono();
                break;
                case 3:
                    System.out.println("Que le valla bien");
                break;
                default:
                    System.out.println("Opcion incorrecta, favor de escribir uno de los numeros en pantalla");
                break;
            }
        }while(opcion!=3);
    }
 }