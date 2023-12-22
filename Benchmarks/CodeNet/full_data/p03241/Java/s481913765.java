import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int d = m / n;
        int a = m % n;
        if (a == 0) {
            System.out.println(d);
        } else if (d % a == 0) {
            System.out.println(a);
        } else {
            System.out.println(1);
        }
    }
}