package ObjetosSimples.Fecha;

import org.junit.Test;

import static org.junit.Assert.*;

public class FechaTest {

    @Test
    public void casoPrimero() {
        //arrange
        Fecha mi_fecha = new Fecha(27,12,1996);
        String expected = "12/27/1996";

        //act
        String result = mi_fecha.FechaCompleta();

        //assert
        assertEquals(expected, result);
    }

    @Test
    public void casoSegundo() {
        //arrange
        Fecha mi_fecha = new Fecha("Diciembre", 27,1996);
        String expected = "Diciembre 27, 1996";

        //act
        String result = mi_fecha.FechaCompleta();

        //assert
        assertEquals(expected, result);
    }

    @Test
    public void casoTercero() {
        //arrange
        Fecha mi_fecha = new Fecha(200,1996);
        String expected = "200, 1996";

        //act
        String result = mi_fecha.FechaCompleta();

        //assert
        assertEquals(expected, result);
    }
}