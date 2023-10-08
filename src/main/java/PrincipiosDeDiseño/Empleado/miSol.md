Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}
```
---

DRY podria ser / PolC podria ser. Es DRY porque se esta repitiendo esa informacion. La solucion seria sacar el metodo getNombre completo. Y MAS QUE NADA POLC ya que estamos exóniendo un metodo
que no aporta nada nuevo.