Dado el siguiente código, identificar un problema de diseño y proponer una solución aplicando algún patrón de diseño.

Este código es en el contexto de un videojuego de futbol:

```java
public interface Jugador {
    void jugar();
    void dibujar();
}

public class ArqueroHumano() implements Jugador {
    public void jugar() { ... }
    public void dibujar() { ... }
}

public class ArqueroIA() implements Jugador {
    public void jugar() { ... }
    public void dibujar() { ... }
}
public class DefensorHumano() implements Jugador {
    public void jugar() { ... }
    public void dibujar() { ... }
}

public class DefensorIA() implements Jugador {
    public void jugar() { ... }
    public void dibujar() { ... }
}

public class MediocampistaHumano() implements Jugador {
    public void jugar() { ... }
    public void dibujar() { ... }
}

public class MediocampistaIA() implements Jugador {
    public void jugar() { ... }
    public void dibujar() { ... }
}

public class DelanteroHumano() implements Jugador {
    public void jugar() { ... }
    public void dibujar() { ... }
}

public class DelanteroIA() implements Jugador {
    public void jugar() { ... }
    public void dibujar() { ... }
}
```
---

El problema de diseño es que se repite mucho codigo y podria solucionarse agregando mas interfaces y creando una composicion: Se puede aplicar Strategy.
