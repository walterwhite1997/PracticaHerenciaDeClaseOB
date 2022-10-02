public class Main {
    public static void main(String[] args) {
     Cliente cliente = new Cliente();
     cliente.edad = 23;
     cliente.nombre = "Walter";
     cliente.telefono = 93334445;
     cliente.credito = 152364;
     System.out.println("Mi nombre es " + cliente.nombre + ", tengo " + cliente.edad + " años mi telefono es " + cliente.telefono
                + " y mi credito disponible es de " + cliente.credito + "$");

   


     Trabajador trabajador = new Trabajador();
        trabajador.edad = 22;
        trabajador.nombre = "Julio";
        trabajador.telefono = 2342341;
        trabajador.salario = 23213;
         System.out.println("Mi nombre es " + trabajador.nombre + ", tengo " + trabajador.edad + " años, mi telefono es el " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "$");
      
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
