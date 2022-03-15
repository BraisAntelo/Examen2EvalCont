package src.examen;

import static org.junit.jupiter.api.Assertions.*;

class CuentaCorrienteTest {

    @org.junit.jupiter.api.Test
    void setGestor() {
    }

    @org.junit.jupiter.api.Test
    void sacarDinero() {
        CuentaCorriente c = new CuentaCorriente("3241341","asdasd");
        assertFalse( c.sacarDinero(10));
    }

    @org.junit.jupiter.api.Test
    void ingresarDinero() {
        CuentaCorriente c = new CuentaCorriente("3241341","asdasd");
        c.ingresarDinero(20);
        assertEquals(20,c.saldo);
    }

    @org.junit.jupiter.api.Test
    void mostrarInformacion() {

    }
}