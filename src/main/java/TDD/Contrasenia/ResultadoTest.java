package TDD.Contrasenia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.beans.Transient;

public class ResultadoTest {
    @Test
    public void testResultadoBasico {
        var estado = false;
        var mensajes = "La contraseña debe tener al menos 8 caracteres\n";
        var res = new Resultado(estado, mensajes)
        assertEquals(mensajes, res.mensajes());
        assertFalse(estado, res.estado());
    }

    @Test
    public void testResultadoBasicoDos {
        var estado = true;
        String mensajes;
        var res = new Resultado(estado, mensajes);
        assertEquals(mensajes, res.mensajes());
        assertFalse(estado, res.estado());
    }

    @Test
    public void testResultadoBasicoTres {
        var estado = false;
        String mensajes = "La contraseña debe tener al menos 8 caracteres\nLa contraseña debe contener al menos 2 números";
        var res = new Resultado(estado, mensajes);
        assertEquals(mensajes, res.mensajes());
        assertFalse(estado, res.estado());
    }
}
