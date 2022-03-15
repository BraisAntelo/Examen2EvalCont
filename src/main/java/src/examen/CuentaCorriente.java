package src.examen;

/**
 *
 */
public class CuentaCorriente {
    public String dni;
    public String nombreTitular;
    public double saldo;
    Gestor gestor;

    /**
     * Constructor donde se nos pide los parametros siguienetes:
     * @param dni
     * @param nombreTitular
     */
    public CuentaCorriente(String dni, String nombreTitular) {
        this(dni,nombreTitular,0);
    }

    /**
     * Constructor donde se nos pide los parametros siguienetes:
     * @param dni
     * @param saldo
     */

    public CuentaCorriente(String dni, double saldo) {
        this(dni,"Sin asignar", saldo);
    }

    /**
     * Constructor donde se nos pide los parametros siguienetes:
     * @param dni
     * @param nombreTitular
     * @param saldo
     */

    public CuentaCorriente(String dni, String nombreTitular, double saldo) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    /**
     * Constructor donde se nos pide los parametros siguienetes:
     * @param dni
     * @param nombreTitular
     * @param saldo
     * @param gestor
     */
    public CuentaCorriente(String dni, String nombreTitular, double saldo, Gestor gestor) {
        this(dni,nombreTitular,saldo);
        this.gestor = gestor;
    }

    /**
     * Introduce el gestor
     * @param gestor
     */

    void setGestor (Gestor gestor) {
        this.gestor = gestor;
    }

    /**
     * Metodo de sacar dinero
     * @param cantidad
     * @return
     */

    boolean sacarDinero(double cantidad) {
        boolean operacionCorrecta;
        if (saldo >=cantidad) {
            saldo-=cantidad;
            operacionCorrecta = true;
        }
        else {
            System.out.println("No hay saldo suficiente");
            operacionCorrecta = false;
        }
        return operacionCorrecta;

    }

    /**
     * Metodo de ingresar dinero
     * @param cantidad
     */

    void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    /**
     * Muestra la info
     */

    void mostrarInformacion() {
        if (gestor == null)
            System.out.println("No hay gestor asignado");
        else
            System.out.println(gestor.toString());

        System.out.printf("Nombre: %s \nDNI: %s \nSaldo: %.2f\n\n",nombreTitular,dni,saldo);
    }
}
