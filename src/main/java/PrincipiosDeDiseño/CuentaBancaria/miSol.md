Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
public class CuentaBancaria {
    private int saldo;

    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    public void retirar(int cantidad) {
        saldo -= cantidad;
    }

    public int obtenerSaldo() {
        return saldo;
    }
}

public class CajeroAutomatico {
    private CuentaBancaria cuenta;

    public void retirarDinero(int cantidad) {
        if (cuenta.obtenerSaldo() >= cantidad) {
            cuenta.retirar(cantidad);
            System.out.println(cantidad + " retirados exitosamente.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
```
---
Podria ser SoC (Separation of Concerns) O el SRP. Mas que nada SRP ya que el metodo retirar dinero se encarga además de imprimir por pantalla.

```java
public class CajeroAutomatico {
    private CuentaBancaria cuenta;

    public boolean retirarDinero(int cantidad) {
        if (cuenta.obtenerSaldo() >= cantidad) {
            cuenta.retirar(cantidad);
            return true;
        }
        return false; 
    }
}

public static class ImprimirEstado {
    public static ImprimirEstado(boolean valido, int cantidad) {
        if (!valido) {
            System.out.println("Fondos insuficientes.");
            return
        }
        System.out.println(cantidad + " retirados exitosamente.");
    }
}

Main:
ImprimirEstado.ImprimirEstado(miCajero.retirarDinero(20), 20);
```

V2 CLARAMENTE el VIOLADO ES TDA PORQUE LE ESTA PREGUTNADO A LA CLASE Y ACTUA EN ESO, HAY QUE PEDIRLE Y MOVER LA LOGICA A LA CLASE CUENTA.