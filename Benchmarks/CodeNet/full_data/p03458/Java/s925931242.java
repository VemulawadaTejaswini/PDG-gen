import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), k = sc.nextInt();
        int[][] b = new int[k * 2][k * 2];
        int[][] w = new int[k * 2][k * 2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() % (k * 2);
            int y = sc.nextInt() % (k * 2);
            if (sc.next().equals("W")) {
                w[y][x]++;
            } else {
                b[y][x]++;
            }
        }
        int max = 0;
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k; j++) { // white left bottom is [i][j]
                if (i == k && j == k) {
                    continue;
                }
                int count = 0;
                for (int l = 0; l < k * 2; l++) {
                    for (int m = 0; m < k * 2; m++) {
                        if (l < i && m < j
                            || l >= i && l < k + i && m >= j && m < k + j
                            || l >= k + i && m >= k + j) {
                            count += w[l][m];
                        } else {
                            count += b[l][m];
                        }
                    }
                }
                max = Math.max(count, max);
            }
        }
        System.out.println(max);
    }
}
