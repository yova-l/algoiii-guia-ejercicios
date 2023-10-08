package HerenciaYPolimorfismo.ListaDuplicante;

import java.util.ArrayList;

public class ListaDuplicanteCompo<K> {
    private ArrayList<K> lista;

    public ListaDuplicanteCompo() {
        lista = new ArrayList<K>();
    }

    public void add(K x) {
        lista.add(x);
        lista.add(x);
    }

    public K get(int i) {
        return lista.get(i);
    }
}
