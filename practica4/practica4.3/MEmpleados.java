public class MEmpleados {
    public static void main (String[] args){ 
        Empleados br = new Empleados();
        br.setNombre(args[0]);
        br.setMesIngreso(Integer.parseInt(args[1]));
        br.setAnioIngreso(Integer.parseInt(args[2]));
        br.setSalariod(Double.parseDouble(args[3]));
        System.out.println("####################################################################");
        System.out.println("# El nombre del empleado es: " + br.getNombre());
        System.out.println("# Empezando a trabajar en del anio " + br.getAnioIngreso());
        System.out.println("# El salario semanal es de = " +  br.Salariosem());
        System.out.println("# La prima vacacional es de = " +  br.Primavacacional());
        System.out.println("# El aguinaldo es de = " + br.Aguinaldo());
        System.out.println("####################################################################");
    }
}