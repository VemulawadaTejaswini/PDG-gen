import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), k = sc.nextInt();
        boolean div = k % 2 == 0;

        System.out.println((int)(Math.pow(n / k, 3) + (div ? Math.pow(n / k + 1, 3) : 0)));
    }
}