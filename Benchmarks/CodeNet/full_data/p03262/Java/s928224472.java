import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), x = sc.nextInt();
        int[] c = new int[n + 1];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        c[n] = x;
        c = sortDescending(c);

        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = c[i] - c[i + 1];
        }
        System.out.println(gcd(diff));
    }

    private static int gcd(int[] c) {
        return Arrays.stream(c)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger::gcd)
                .orElse(BigInteger.ZERO)
                .intValue();
    }

    private static int[] sortDescending(int[] array) {
        return IntStream.of(array).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
