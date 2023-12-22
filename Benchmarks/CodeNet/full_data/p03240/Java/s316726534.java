import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                int ch = -1;
                for (int k = 0; k < n; k++) {
                    if (ch == -1) {
                        if (h[k] > 0) {
                            ch = h[k] + Math.abs(x[k] - j) + Math.abs(y[k] - i);
                        }
                    } else {
                        if (ch != h[k] + Math.abs(x[k] - j) + Math.abs(y[k] - i)) {
                            ch = -2;
                            break;
                        }
                    }
                }
                if (ch >= 0) {
                    for (int k = 0; k < n; k++) {
                        if (h[k] == 0) {
                            if (Math.abs(x[k] - j) + Math.abs(y[k] - i) < ch) {
                                ch = -2;
                                break;
                            }
                        }
                    }
                }
                if (ch >= 0) {
                    System.out.println(j + " " + i + " " + ch);
                }
            }
        }
    }
}