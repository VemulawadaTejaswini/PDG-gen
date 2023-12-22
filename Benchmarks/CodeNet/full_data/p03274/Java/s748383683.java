import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), k = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int diff = Math.abs(x[i] - x[i + k - 1]);
            int tmp = diff + Math.min(Math.abs(x[i]), Math.abs(x[i + k - 1]));
            ans = Math.min(tmp, ans);
        }
        System.out.println(ans);
    }
}
