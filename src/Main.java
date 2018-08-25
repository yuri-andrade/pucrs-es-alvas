import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SeparaParImpar separaParImpar = new SeparaParImpar();

        int[] randomArray = separaParImpar.populateArray(2, 2);
        System.out.println(Arrays.toString(randomArray));
        int[] arrayComAux = separaParImpar.separaParImparComVetorAuxiliar(randomArray);
        System.out.println(Arrays.toString(arrayComAux));
        int[] arraySemAux = separaParImpar.separaParImparSemVetorAuxiliar(randomArray);
        System.out.println(Arrays.toString(arraySemAux));




    }

}
