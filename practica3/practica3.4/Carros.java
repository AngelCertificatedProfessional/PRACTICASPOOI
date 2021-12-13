public class Carros {
    private String marca;
    private float capacidadTanque;
   
    public void llenarTanque() {
        System.out.println ("Se cargaron " + capacidadTanque + " litros de gasolina");
    }
    public void avanzar() {
        System.out.println("pasean en el carro " + marca);
    }
   
    public static void main(String[] args){
        Carros carro = new Carros();
        //hay que asegurarse que el valor pueda ser totalmente flotante por lo que se agrega el float para indicar que el paseo esta haciendose correctamente
        carro.capacidadTanque=(float) 60.5; 
        //en este segmento toyota es un valor tipo cadena, por lo que se agregan las comillas dobles
        carro.marca= "toyota";
        carro.llenarTanque();
        carro.avanzar();
   }
}