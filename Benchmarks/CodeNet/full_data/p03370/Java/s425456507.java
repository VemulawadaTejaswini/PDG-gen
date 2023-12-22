import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        int quantity = scanner.nextInt();
        Integer[] cakes = new Integer[givenNumber];
        int sumCakesQuantity = 0;
        for(int i=0; i<givenNumber; i++) {
            cakes[i] = scanner.nextInt();
            sumCakesQuantity += cakes[i];
        }

        int quantityLeft = quantity - sumCakesQuantity;
        int maxCakes = 0;
        if(quantityLeft > 0) {
            maxCakes = quantityLeft / Collections.min(Arrays.asList(cakes));;
        }
        System.out.println(givenNumber + maxCakes);
    }
}
