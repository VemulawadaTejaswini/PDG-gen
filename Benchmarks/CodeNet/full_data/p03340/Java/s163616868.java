import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = n;

        int[] dpXor = new int[n];
        int[] dpSum = new int[n];
        dpXor[0] = a[0];
        dpSum[0] = a[0];
        for (int i = 1; i < n; i++) {
            dpXor[i] = dpXor[i - 1] ^ a[i];
            dpSum[i] = dpSum[i - 1] + a[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int x, s;
                if (i == 0) {
                    x = dpXor[j];
                    s = dpSum[j];
                } else {
                    x = dpXor[i - 1] ^ dpXor[j];
                    s = dpSum[j] - dpSum[i - 1];
                }
                if (x == s) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
