package Class_01;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

import classes.*;

public class Class_01 {

    @Test
    public void helloLogic() {
        int numero = 1;

        assertEquals(1, numero);
    }

    @Test
    public void numeroVSString() {
        int numero = 1;
        String numeroString = "1";
        String resultado = Integer.toString(numero);

        assertEquals(numeroString, resultado);
    }

    @Test
    public void listaContieneNumero() {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(5);

        assertEquals(1, listaNumeros.size());
        assertEquals(5, listaNumeros.get(0).intValue());
    }


    @Test
    public void listaNumerosContienenLoMismo() {
        ArrayList<Integer> listaNumeros1 = new ArrayList<Integer>();
        listaNumeros1.add(1);

        ArrayList<Integer> listaNumeros2 = new ArrayList<Integer>();
        listaNumeros2.add(1);

        assertTrue(listaNumeros1.containsAll(listaNumeros2));
    }

    @Test
    public void listaNumerosContienenLoMismo2() {
        ArrayList<Integer> listaNumeros1 = new ArrayList<Integer>();
        listaNumeros1.add(1);

        ArrayList<Integer> listaNumeros2 = new ArrayList<Integer>();
        listaNumeros2.add(1);

        assertEquals(listaNumeros1, listaNumeros2);
    }

    @Test
    public void listaNumerosIguales() {
        ArrayList<Integer> listaNumeros1 = new ArrayList<Integer>();
        listaNumeros1.add(1);

        ArrayList<Integer> listaNumeros2 = new ArrayList<Integer>();
        listaNumeros2.add(1);

        assertSame(listaNumeros1, listaNumeros2);
    }

    @Test
    public void listaNumerosIguales2() {
        ArrayList<Integer> listaNumeros1 = new ArrayList<Integer>();
        listaNumeros1.add(1);

        ArrayList<Integer> listaNumeros2 = new ArrayList<Integer>();
        listaNumeros2.add(1);

        assertTrue(listaNumeros1 == listaNumeros2);
    }

    @Test
    public void miPrimerObjeto() {
        MiPrimeraClase miPrimerObjeto = new MiPrimeraClase();
        miPrimerObjeto.setPropieadad1("1");

        assertEquals("1", miPrimerObjeto.getPropieadad1());
    }


    @Test
    public void objetosIguales() {
        MiPrimeraClase objeto1 = new MiPrimeraClase();
        MiPrimeraClase objeto2 = new MiPrimeraClase();

        assertSame(objeto1, objeto2);
    }

    @Test
    public void objetosIguales2() {
        MiPrimeraClase objeto1 = new MiPrimeraClase();
        MiPrimeraClase objeto2 = new MiPrimeraClase();

        assertTrue(objeto1 == objeto2);
    }

    @Test
    public void objetosContienenLoMismo() {
        MiPrimeraClase objeto1 = new MiPrimeraClase();
        MiPrimeraClase objeto2 = new MiPrimeraClase();

        assertEquals(objeto1, objeto2);
    }

    @Test
    public void objetosContienenLoMismoHabiendoCreadoEquals() {
        MiSegundaClase objeto1 = new MiSegundaClase();
        MiSegundaClase objeto2 = new MiSegundaClase();

        assertEquals(objeto1, objeto2);
    }
}