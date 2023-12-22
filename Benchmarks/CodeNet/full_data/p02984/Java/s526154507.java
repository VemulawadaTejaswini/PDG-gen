import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] array = new long[n];
        Arrays.setAll(array, i -> scanner.nextLong());
        long sum = 0L;
        long evenSum = 0L;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (i % 2 == 1) {
                evenSum += array[i];
            }
        }
        long start = sum - (2 * evenSum);

        System.out.println(start);

        for (int i = 1; i < n; i++) {
            start = 2 * array[i - 1] - start;
            System.out.println(start);
        }
    }
}