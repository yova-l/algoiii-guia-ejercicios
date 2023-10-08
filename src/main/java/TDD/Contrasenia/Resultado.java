package TDD.Contrasenia;

public class Resultado {
    private boolean estado;
    private String mensajes;

    public Resultado(boolean estado, String mensajes) {
        this.estado = estado;
        this.mensajes = mensajes;
    }

    public boolean estado() {
        return this.estado;
    }

    public String mensajes() {
        return this.mensajes;
    }
}
