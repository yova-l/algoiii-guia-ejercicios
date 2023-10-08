package HerenciaYPolimorfismo.ListaDuplicante;

import java.util.ArrayList;

public class ListaDuplicanteHerencia<K> extends ArrayList<K> {
    @Override
    public boolean add(K elemento) {
        super.add(elemento);
        super.add(elemento);
        return true;
    }

    @Override
    public K get(int index) {
        return super.get(index);
    }
}

// Una ventaja/desventaja de heredar es que automaticamente tenemos disponibles todos los metodos
// del ArrayList. Y su contraparte tambien una ventaja/desventaja de usar composicion es que generamos
// metodos mas controlados si no queremos exponer todos los metodos al usuario. 