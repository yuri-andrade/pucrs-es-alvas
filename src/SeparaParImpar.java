import java.util.Random;

/**
 * Classe para implementação da tarefa da cadeira de algoritmos avancados.
 */
public class SeparaParImpar {
    /**
     * Método que percorre um vetor e agrupa pares no inicio e ímpares no final sem o uso de vetor auxiliar.
     *
     * @param array vetor qualquer
     * @return array vetor ordenado
     */
    public int[] separaParImparSemVetorAuxiliar(final int... array) {
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
    public int[] separaParImparComVetorAuxiliar(final int... array) {
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
     * Metodo que popula um vetor com numeros aleatorios.
     *
     * @param evenNumebers quantidade de numeros pares desejados
     * @param oddNumbers   quantidade de numeros impares desejados
     * @return vetor populado
     */
    public int[] populateArray(final int evenNumebers, final int oddNumbers) {
        final Random randomNumber = new Random();
        final int size = evenNumebers + oddNumbers;
        int[] array = new int[size];
        int evenCount = 0;
        int oddCount = 0;
        int i = 0;
        while (i < size) {
            final int rand = randomNumber.nextInt(1000000000);
            if (rand % 2 == 0) {
                if (evenCount < evenNumebers) {
                    array[i] = rand;
                    evenCount++;
                    i++;
                }
            } else if (oddCount < oddNumbers) {
                array[i] = rand;
                oddCount++;
                i++;
            }
        }
        return array;
    }
}
