public class Plumones{
    private String color;
    private String marca;
    public String tipo;
    
    public void escribir(String msg)
    {
        System.out.println(msg+" usando el plumon "+ marca);
    }
    
    public void pintar(){
        System.out.println("pintando de color "+ color + " sobre " + tipo);
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    public static void main (String[] args) {
        Plumones plumon = new Plumones();
        plumon.setMarca(args[1]);
        plumon.setColor(args[0]);
        plumon.tipo="pizarron";
        plumon.pintar();
        plumon.escribir("Pintando");
    }
}