import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();
        int[][] loc = new int[m][2];
        int[][] ques = new int[q][2];
        int[][] count = new int[n][n];

        for (int i = 0; i < m; i++) {
            loc[i][0] = sc.nextInt() - 1;
            loc[i][1] = sc.nextInt() - 1;
        }
        for (int i = 0; i < q; i++) {
            ques[i][0] = sc.nextInt() - 1;
            ques[i][1] = sc.nextInt() - 1;
        }

        for (int i = 0; i < m; i++) {
            for (int j = loc[i][1]; j < n; j++) {
                count[loc[i][0]][j]++;
            }
        }
        for (int i = 0; i < q; i++) {
            int ans = 0;
            for (int j = ques[i][0]; j <= ques[i][1]; j++) {
                ans += count[j][ques[i][1]];
            }
            System.out.println(ans);
        }
    }
}
