import java.util.List;
import java.util.Collections;

public class MyListUtil {
    public List<Integer> sort(List<Integer> list, int order) {
        if (order == 0) {
            // Ordine crescente
            Collections.sort(list);
        } else if (order == 1) {
            // Ordine decrescente
            Collections.sort(list, Collections.reverseOrder());
        } else {
            throw new IllegalArgumentException("Valore di 'order' non valido. Deve essere 0 per ascendente o 1 per discendente.");
        }
        return list;
    }

}
