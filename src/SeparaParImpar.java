import java.sql.Time;
import java.util.*;

/**
 * Classe para implementação da tarefa da cadeira de algoritmos avancados
 */
public class SeparaParImpar {
    /**
     * Método que percorre um vetor e agrupa pares no inicio e ímpares no final sem o uso de vetor auxiliar.
     *
     * @param array vetor qualquer
     * @return array vetor ordenado
     */
    public int[] separaParImparSemVetorAuxiliar(int... array) {
        int i = 0;
        while (i < array.length) {
            boolean switched = false;
            if (array[i] % 2 == 0) {
                i++;
            } else {
                int j = i;
                while (!switched) {
                    if (array[j] % 2 != 0 && j < array.length - 1) {
                        j++;
                    } else {
                        final int aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                        i++;
                        switched = true;
                    }
                }
            }
        }
        return array;
    }

    /**
     * Método que percorre um vetor e agrupa pares no inicio e ímpares no final com o uso de vetor auxiliar.
     *
     * @param array vetor qualquer
     * @return arrayOrdenado vetor ordenado
     */
    public int[] separaParImparComVetorAuxiliar(int... array) {
        int[] arrayOrdenado = new int[array.length];
        int contEven = 0;
        int contOdd = array.length - 1;
        for (int numero : array) {
            if (numero % 2 == 0) {
                arrayOrdenado[contEven] = numero;
                contEven++;
            } else {
                arrayOrdenado[contOdd] = numero;
                contOdd--;
            }
        }
        return arrayOrdenado;
    }

    /**
     * Método que popula um vetor com números aleatórios.
     *
     * @param evenNumebers quantidade de numeros pares desejados
     * @param oddNumbers   quantidade de numeros impares desejados
     * @return vetor populado
     */
    public int[] randomArray(final int evenNumebers, final int oddNumbers) {
        final int size = evenNumebers + oddNumbers;
        int[] array = new int[size];
        int oddCount = 0, evenCount = 0;
        List<Integer> lista = new ArrayList<>();
        while (lista.size() < size) {
            int random = (int) (Math.random() * 100000000);
            if (random % 2 == 0) {
                if (evenCount < evenNumebers) {
                    lista.add(random);
                    evenCount++;
                }
            } else {
                if (oddCount < oddNumbers) {
                    lista.add(random);
                    oddCount++;
                }
            }
        }
        Collections.shuffle(lista);
        int i = 0;
        for (Integer numero : lista) {
            array[i] = numero;
            i++;
        }
        return array;
    }
}
