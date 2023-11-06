package Funcional.Refactorizar;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MisSoluciones {
    //a
//    public static int sumaCuadrados(int n) {
//        if (n == 0) { return 0; }
//        return sumaCuadrados(n - 1) + (n * n);
//    }

    public static int sumaCuadrados(int n) {
        return IntStream.rangeClosed(1, n)
                .map(x -> x * x)
                .sum();
    }

    public static List<String> top10(List<String> strings) {
        // Devuelve la lista de las 10 cadenas más frecuentes de la lista, ordenadas de
        // mayor a menor por frecuencia.
        return strings.stream()
                .collect(Collectors.groupingBy( str -> str, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static Map<Character, List<String>> agruparPorInicial(List<String> strings) {
        return strings.stream()
                .filter(nombre -> nombre.length() > 0)
                .collect(Collectors.groupingBy(
                        nombre -> Character.toUpperCase(nombre.charAt(0)),
                        Collectors.toList()
                ));
    }
}
