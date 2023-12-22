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
        if (k / 2 + n / k * k > n) {
            divk = 0;
        }

        if (div && k > n && k <= n * 2) {
            System.out.println(1);
        } else {
            System.out.println(((long) Math.pow(n / k, 3) + (div ? (long) Math.pow(n / k + divk, 3) : 0L)));
        }
    }
}