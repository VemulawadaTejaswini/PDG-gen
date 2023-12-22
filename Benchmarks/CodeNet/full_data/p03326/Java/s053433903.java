import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[][] xyz = new long[N][3];
        long[][] ans = new long[N][8];
        long[] A = new long[8];
        for (int i = 0; i < N; i++) {
            xyz[i][0] = sc.nextLong();
            xyz[i][1] = sc.nextLong();
            xyz[i][2] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            ans[i][0] = xyz[i][0] + xyz[i][1] + xyz[i][2];
            ans[i][1] = xyz[i][0] + xyz[i][1] - xyz[i][2];
            ans[i][2] = xyz[i][0] - xyz[i][1] + xyz[i][2];
            ans[i][3] = xyz[i][0] - xyz[i][1] - xyz[i][2];
            ans[i][4] = -xyz[i][0] + xyz[i][1] + xyz[i][2];
            ans[i][5] = -xyz[i][0] + xyz[i][1] - xyz[i][2];
            ans[i][6] = -xyz[i][0] - xyz[i][1] + xyz[i][2];
            ans[i][7] = -xyz[i][0] - xyz[i][1] - xyz[i][2];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[0], b[0]));
        for (int i = 0; i < M; i++) {
            A[0] += ans[N - 1 - i][0];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[1], b[1]));
        for (int i = 0; i < M; i++) {
            A[1] += ans[N - 1 - i][1];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[2], b[2]));
        for (int i = 0; i < M; i++) {
            A[2] += ans[N - 1 - i][2];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[3], b[3]));
        for (int i = 0; i < M; i++) {
            A[3] += ans[N - 1 - i][3];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[4], b[4]));
        for (int i = 0; i < M; i++) {
            A[4] += ans[N - 1 - i][4];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[5], b[5]));
        for (int i = 0; i < M; i++) {
            A[5] += ans[N - 1 - i][5];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[6], b[6]));
        for (int i = 0; i < M; i++) {
            A[6] += ans[N - 1 - i][6];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[7], b[7]));
        for (int i = 0; i < M; i++) {
            A[7] += ans[N - 1 - i][7];
        }
        Arrays.sort(A);
        System.out.println(A[7]);
    }

}