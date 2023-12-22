import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        x[0] = sc.nextInt();
        y[0] = sc.nextInt();
        int sum = Math.abs(x[0]) + Math.abs(y[0]);
        int max = sum;
        boolean even = true;
        if (sum % 2 != 0) {
            even = false;
        }
        for (int i = 1; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            int s = Math.abs(x[i]) + Math.abs(y[i]);
            max = Math.max(s, max);
            if (s % 2 == 0 && !even || s % 2 != 0 && even) {
                System.out.println(-1);
                return;
            }
        }
        int m = max;
        System.out.println(m);
        for (int i = 0; i < m; i++) {
            System.out.print(1);
            if (i != m - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int s = Math.abs(x[i]) + Math.abs(y[i]);
            while (m > s) {
                System.out.print("UD");
                s += 2;
            }
            while (x[i] != 0) {
                if (x[i] > 0) {
                    System.out.print("R");
                    x[i]--;
                } else {
                    System.out.print("L");
                    x[i]++;
                }
            }
            while (y[i] != 0) {
                if (y[i] > 0) {
                    System.out.print("U");
                    y[i]--;
                } else {
                    System.out.print("D");
                    y[i]++;
                }
            }
            System.out.println();
        }
    }
}