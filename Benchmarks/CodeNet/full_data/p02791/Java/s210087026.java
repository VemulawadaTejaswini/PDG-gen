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
            boolean addThisInt;
            for (int currentIntToCheck : array) {
                addThisInt = true;
                for (int j = 0; j < currentIntToCheck; j++) {
                    if (array[currentIntToCheck - 1] > array[j]) {
                        addThisInt = false;
                        break;
                    }
                }
                if (addThisInt) {
                    counter++;
                }
            }
            System.out.println(counter);
    }
}