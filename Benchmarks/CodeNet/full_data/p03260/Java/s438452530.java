import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println((a % 2 == 0 || b % 2 == 0) ? "No" : "Yes");
    }
}
