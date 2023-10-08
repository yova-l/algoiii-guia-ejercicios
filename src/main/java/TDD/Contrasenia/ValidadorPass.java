package TDD.Contrasenia;

import java.util.ArrayList;
import java.util.List

import ObjetosSimples.Chat.Solucion.Mensaje;

public class ValidadorPass {
    private static boolean cumpleLargoPass(String password) {
        return password.length() >= 8;
    }

    private static boolean cumpleDosNumsPass(String password) {
        var cantNums = 0;
        
        // Performance penalty, un for i capaz mejor
        for (char caracter : password.toCharArray() ) {
            if (Character.isDigit(caracter)) {
                cantNums++;
            }
        }
        return cantNums >= 2;
    }

    private static boolean tieneAlMenosUnaMayus(String password) {
        for (char caracter : password.toCharArray() ) {
            if (Character.isUpperCase(caracter)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tieneAlMenosUnEspecial(String password) {
        for (char caracter : password.toCharArray() ) {
            if (!Character.isLetterOrDigit(caracter)) {
                return true;
            }
        }
        return false;
    }
    
    public static Resultado validar(String password) {
        String mensajes;
        boolean cumple = true;
        
        if (!cumpleLargoPass(password)) {
            mensajes.concat("La contraseña debe tener al menos 8 caracteres\n");
            cumple = false;
        }

        if (!cumpleDosNumsPass(password)) {
            mensajes.concat("La contraseña debe contener al menos 2 números\n");
            cumple = false;
        }

        if (!tieneAlMenosUnEspecial(password)) {
            mensajes.concat("La contraseña debe contener al menos un carácter especial\n");
            cumple = false;
        }

        if (!tieneAlMenosUnaMayus(password)) {
            mensajes.concat("La contraseña debe contener al menos una letra mayúscula\n");
            cumple = false;
        }

        return new Resultado(cumple, mensajes);
    }
}


