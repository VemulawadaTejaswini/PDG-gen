import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int totalBoxes = scanner.nextInt();
        final int maxSum = scanner.nextInt();

        int counter = 0;
        int prev = 0;
        for (int i = 0; i < totalBoxes; i++) {
            final int candiesCount = scanner.nextInt();
            if ((candiesCount + prev) > maxSum) {
                counter += candiesCount + prev - maxSum;
                prev = maxSum - prev;
            } else {
                prev = candiesCount;
            }
        }
        System.out.println(counter);
    }
}
