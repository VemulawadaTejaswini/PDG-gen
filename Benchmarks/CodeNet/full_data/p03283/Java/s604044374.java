import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] cnt = new int[N][N];
        for (int i = 0; i < M; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            cnt[l][r]++;
        }
        for (int i = N - 2; i >= 0; i--)
            for (int j = 0; j < N; j++)
                cnt[i][j] += cnt[i + 1][j];
        for (int i = 1; i < N; i++)
            for (int j = 0; j < N; j++)
                cnt[j][i] += cnt[j][i - 1];
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            pw.println(cnt[p][q]);
        }
        pw.close();
        sc.close();
    }
}