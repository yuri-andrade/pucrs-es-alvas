import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SeparaParImpar separaParImpar = new SeparaParImpar();

        int[] arreeeey = separaParImpar.separaParImpar(separaParImpar.populateArray(8, 2));
        Arrays.stream(arreeeey).forEach(System.out::println);
        System.out.println(Arrays.toString(arreeeey));
    }

}
