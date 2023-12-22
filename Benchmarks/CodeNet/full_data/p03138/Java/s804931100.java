import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        long[] x = new long[n];
        for (int i = 0; i < n; i++)
            x[i] = scanner.nextLong();

        System.out.println(LongStream.rangeClosed(0, k)
                .map(i -> Arrays.stream(x).map(j -> i ^ j).sum())
                .max()
                .getAsLong());
    }
}