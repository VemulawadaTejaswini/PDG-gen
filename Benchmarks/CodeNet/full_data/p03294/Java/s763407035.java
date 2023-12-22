import java.math.BigInteger;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] a = new int[n];
        BigInteger big = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            big = big.multiply(BigInteger.valueOf(a[i]));
        }
        big = big.subtract(BigInteger.ONE);
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            sum = sum.add(big.remainder(BigInteger.valueOf(a[i])));
        }
        System.out.println(sum);
    }
}
