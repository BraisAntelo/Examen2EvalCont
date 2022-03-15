package src.examen;


public class Gestor {
    public String nombre;
    public double importeAutorizado;
    public String telefono;

    /**
     * Contructor de la clase Gestor que nos pide todos los parametros
     * @param nombre
     * @param telefono
     * @param importeAutorizado
     */
    public Gestor(String nombre, String telefono, double importeAutorizado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeAutorizado = importeAutorizado;
    }

    /**
     * Constructor que nos pide solo dos parametros
     * @param nombre
     * @param telefono
     */
    public Gestor(String nombre, String telefono) {
       this(nombre,telefono, 10000);
    }

    /**
     * metodo toString de la clase Gestor
     * @return
     */
    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", importeAutorizado=" + importeAutorizado +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
