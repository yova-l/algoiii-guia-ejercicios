package ObjetosSimples.FIUBA;

import java.util.ArrayList;

public class Alumno {
    private final int padron;
    private int creditos;
    private ArrayList<Materia> materiasAnotadas;
    private ArrayList<Materia> materiasAprobadas;
    private ArrayList<Carrera> carrerasAnotadas;

    public Alumno(int padron) {
        this.padron = padron;
        this.carrerasAnotadas = new ArrayList<Carrera>();
        this.materiasAnotadas = new ArrayList<Materia>();
    }
}
