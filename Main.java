public class Main {
    public static void main(String[] args) {
     Cliente cliente = new Cliente();
     cliente.edad = 23;
     cliente.nombre = "Walter";
     cliente.telefono = 93334445;
     cliente.credito = 152364;
     System.out.println("Edad del cliente: " + cliente.edad);
        System.out.println("Nombre cliente: " + cliente.nombre);
        System.out.println("Numero de telefono: " + cliente.telefono);
        System.out.println("Credito del cliente: " + cliente.credito);


     Trabajador trabajador = new Trabajador();
        trabajador.edad = 22;
        trabajador.nombre = "Julio";
        trabajador.telefono = 2342341;
        trabajador.salario = 23213;
        System.out.println("Edad del trabajador: " + trabajador.edad);
        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Numero de telefono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);
    }
}

class Persona {
    public int edad;
    public String nombre;
    public int telefono;

}

class Cliente extends Persona {
    public double credito;
}

class Trabajador extends Persona {
    public double salario;
}