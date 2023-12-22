import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] AB = new int[N][2];
        for (int i = 0; i < N; i++) {
            AB[i][0] = sc.nextInt();
            AB[i][1] = sc.nextInt();
        }

        Arrays.sort(AB, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        int[][] ot = new int[N+1][T];
        int[][] ft = new int[N+1][T];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < T; j++) {
                int finishTime = ft[i][j];
                if (j >= AB[i][0]) {
                    finishTime = Math.max(finishTime, ft[i][j-AB[i][0]] + AB[i][1]);
                }
                ft[i+1][j] = finishTime;

                ot[i+1][j] = Math.max(ot[i][j], ft[i][j] + AB[i][1]);
            }
        }
        System.out.println(ot[N][T-1]);
    }
}
