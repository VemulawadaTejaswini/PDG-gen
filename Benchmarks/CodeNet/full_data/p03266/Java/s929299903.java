import java.math.BigInteger;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        long n = sc.nextLong(), k = sc.nextLong();
        boolean div = k % 2 == 0;
        long divk = 1;
        if (k / 2 + k > n) {
            divk = 0;
        }

        if (div && k > n && k <= n * 2) {
            System.out.println(1);
        } else {
            BigInteger nk = BigInteger.valueOf(n / k);
            nk = nk.pow(3);
            if (div) {
                BigInteger nkd = BigInteger.valueOf(n / k + divk);
                nk = nk.add(nkd.pow(3));
            }
            System.out.println(nk);
        }
    }
}