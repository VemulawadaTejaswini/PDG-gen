import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] time = new int[n + 1];
        int[][] coord = new int[n][2];
        for (int i = 0; i < n; i++) {
            time[i + 1] = sc.nextInt();
            coord[i][0] = sc.nextInt();
            coord[i][1] = sc.nextInt();
        }

        int[] c = new int[]{0, 0};
        for (int i = 0; i < n; i++) {
            int t = time[i + 1] - time[i];
            int x = coord[i][0];
            int y = coord[i][1];
            int dist = Math.abs(x - c[0]) + Math.abs(y - c[1]);
            c[0] = x;
            c[1] = y;
            if (dist == t) {
                continue;
            } else if (dist > t || (t - dist) % 2 != 0) {
                System.out.println("No");
                return;
            }

        }
        System.out.println("Yes");
    }
}
