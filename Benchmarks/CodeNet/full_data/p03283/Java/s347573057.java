import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();
        int[][] loc = new int[m][2];
        for (int i = 0; i < m; i++) {
            loc[i][0] = sc.nextInt();
            loc[i][1] = sc.nextInt();
        }

        int[][] ques = new int[q][2];
        for (int i = 0; i < q; i++) {
            ques[i][0] = sc.nextInt();
            ques[i][1] = sc.nextInt();
        }

        int[][] count = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            count[loc[i][0]][loc[i][1]]++;
        }
        for (int i = 0; i < q; i++) {
            int sum = 0;
            for (int j = ques[i][0]; j <= ques[i][1]; j++) {
                for (int k = ques[i][0]; k <= ques[i][1]; k++) {
                    sum += count[j][k];
                }
            }
            System.out.println(sum);
        }

    }
}
