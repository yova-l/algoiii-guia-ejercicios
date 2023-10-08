Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
public class Auto {
    private boolean moviendo;

    public void mover() {
        moviendo = !moviendo;
    }

    public boolean enMovimiento() {
        return moviendo;
    }
}
```

---

Se viola el PoLA (Principle of Least Astonishment). Ya que al usar una instancia de esta clase vamos a llamar al metodo mover y hará otra cosa; dependiendo de su estado empezará a moverse o se detendrá. Una solucion alternativa podria ser:

```java
public class Auto {
    private boolean moviendo;

    public void mover() {
        moviendo = true;
    }

    public void detener() {
        moviendo = false;
    }

    public boolean enMovimiento() {
        return moviendo;
    }
}
```