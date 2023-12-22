import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] a_o = new long[N + 1];
        long[] a_f = new long[N + 1];
        long[] a_b = new long[N + 1];
        for (int i = 0; i < N + 1; i++) {
            a_f[i] = scan.nextLong();
            a_b[i] = a_f[i];
            a_o[i] = a_f[i];
        }
        long[] b_f = new long[N + 1];
        long[] b_b = new long[N + 1];
        for (int i = 0; i < N; i++) {
            b_f[i] = scan.nextLong();
            b_b[i] = b_f[i];
        }
        long answer = front(N, a_o, a_f, b_f);
        answer = Math.max(answer,back(N, a_o, a_f, b_f));
        System.out.println(answer);
    }
    private long front(int N, long[] o, long[] a, long[] b) {
        for (int i = 0; i < N; i++) {
            if (0 < b[i]) {
                if (b[i] < a[i]) {
                    a[i] -= b[i];
                    b[i] = 0;
                    continue;
                } else {
                    b[i] -= a[i];
                    a[i] = 0;
                }
            }
            if (b[i] < a[i+1]) {
                a[i+1] -= b[i];
                b[i] = 0;
            } else {
                b[i] -= a[i+1];
                a[i+1] = 0;
            }
        }
        long answer = 0;
        for (int i = 0; i < N + 1; i++) {
            answer += o[i] - a[i];
        }
        return answer;
    }
    private long back(int N, long[] o, long[] a, long[] b) {
        for (int i = N-1; 0 <= i; i--) {
            if (0 < b[i+1]) {
                if (b[i] < a[i+1]) {
                    a[i+1] -= b[i];
                    b[i] = 0;
                    continue;
                } else {
                    b[i] -= a[i+1];
                    a[i+1] = 0;
                }
            }
            if (b[i] < a[i]) {
                a[i] -= b[i];
                b[i] = 0;
            } else {
                b[i] -= a[i];
                a[i] = 0;
            }
        }
        long answer = 0;
        for (int i = 0; i < N + 1; i++) {
            answer += o[i] - a[i];
        }
        return answer;
    }
}
