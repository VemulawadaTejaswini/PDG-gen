import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> rightInts = new ArrayList<>();
        for (int k = 0; k < array.length; k++) {
            int currentIntToCheck = array[k];
            boolean addThisInt = true;
            for (int j = 0; j < currentIntToCheck; j++) {
                if (array[currentIntToCheck - 1] > array[j]) {
                    addThisInt = false;
                    break;
                }
            }
            if (addThisInt) {
                rightInts.add(currentIntToCheck);
            }
        }
        System.out.println(rightInts.size());
    }
}