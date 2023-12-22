import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int a[][] = new int[N+1][N+1];
        for (int i = 1; i <= M; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            a[l][r] += 1;
        }
        for (int i = 1; i <= N; i++) {
            int s = 0;
            for (int j = 1; j <= N; j++) {
                s += a[i][j];
                a[i][j] = s;
            }
        }
        for (int i = 1; i <= N; i++) {
            int s = 0;
            for (int j = 1; j <= N; j++) {
                s += a[j][i];
                a[j][i] = s;
            }
        }
        for (int i = 1; i <= Q; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println(a[q][q] - a[p-1][q] - a[q][p-1] + a[p-1][p-1]);
        }
    }
}
