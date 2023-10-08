package TDD.Contrasenia;

import static org.junit.Assert.*;

public class ValidadorPassTest {
    @Test
    public void testValidadorFalse() {
        var pass = "123";
        var mensaje = "La contraseña debe tener al menos 8 caracteres\n";
        var res = ValidadorPass.validar(pass);
        assertEquals(res.mensaje(), mensaje);
        assertFalse(res.estado());
    }

    @Test
    public void testValidadorTrueLargo() {
        var pass = "12345678";
        String mensaje;
        res = ValidadorPass.validar(pass);
        assertEquals(res.mensaje(), mensaje);
        assertTrue(res.estado());
    }

    @Test
    public void testValidadorTrueTieneAlMenosDosNumeros() {
        var pass = "12345678";
        String mensaje;
        assertTrue(ValidadorPass.validar(pass), mensaje);
        assertEquals(res.mensaje(), mensaje);
    }

    @Test
    public void testValidadorTrueTieneAlMenosDosNumerosFalse() {
        var pass = "abc";
        var mensaje = "La contraseña debe tener al menos 8 caracteres\nLa contraseña debe contener al menos 2 números\n";
        var res = ValidadorPass.validar(pass);
        assertEquals(res.mensaje(), mensaje);
        assertFalse(res.estado());
    }

    // PASO DE LOS DEMAS TEST...
}