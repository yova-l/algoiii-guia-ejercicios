package ObjetosSimples.Fecha;

public class Fecha {
    private final String fechaFinal;
    public Fecha(int day, int month, int year) {
        fechaFinal = String.format("%d/%d/%d",month,day,year);
    }
    public  Fecha(String mes, int day, int year) {
        fechaFinal = String.format("%s %d, %d",mes,day,year);
    }
    public  Fecha(int diaDelAnnio, int year) {
        fechaFinal = String.format("%d, %d", diaDelAnnio, year);
    }
    public String FechaCompleta() {
        return fechaFinal;
    }
}
