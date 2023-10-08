Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getArea() {
        return ancho * alto;
    }
}

public class Cuboide extends Rectangulo {
    private int profundidad;

    public Cuboid(int ancho, int alto, int profundidad) {
        super(ancho, alto);
        this.profundidad = profundidad;
    }

    public int getVolumen() {
        return ancho * alto * profundidad;
    }
}
```

Se viola DRY Y PoLA. En el caso del primero esto es porque hace ancho * alto dos veces, cuando la clase hijo dispone de getArea para hacer este calculo. Ademas se viola PoLA ya que al heredar cuboide de Rectangulo, tiene disponible getArea() que dará el área de una cara del cubo lo que no se condice con el nombre del método.