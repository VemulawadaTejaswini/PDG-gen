import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int counter = 0;
        outerloop:
        for (int currentIntToCheck : array) {
            for (int j = 0; j < currentIntToCheck; j++) {
                if (array[currentIntToCheck - 1] > array[j]) {
                    continue outerloop;
                }
            }
            counter++;
        }
            System.out.println(counter);
    }
}
