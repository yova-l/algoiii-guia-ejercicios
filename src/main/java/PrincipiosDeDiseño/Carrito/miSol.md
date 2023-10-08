Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
public class CarritoDeCompras {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }
}

public class ServicioWeb {
    public agregarAlCarrito(CarritoDeCompras carrito, Item item) {
        carrito.getItems().add(item);
    }
}
```

---
PolK?, KISS na.., OCP (Open/Closed)...
El ppio violado es el OCP ya que si carrito cambia sus metodos o su construccion habria que entrar en el metodo AgregarAlcarrito de la clase serivicio web, ya que el codigo se encuentra acoplado, y depende de que carrito tenga un metodo getItems() y que este devuelva un objeto de tipo List que acepte el mensaje add().. 

En realidad es polk ya que No se deberían invocar los métodos de un objeto retornado por otro método. Una solucion sería:

```java
public class CarritoDeCompras {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    // SE AGREGA ESTE METODO
    public void addItem(Item item) {
        items.add(item);
    }
}

public class ServicioWeb {
    public agregarAlCarrito(CarritoDeCompras carrito, Item item) {
        carrito.addItems(item);
    }
}
```


