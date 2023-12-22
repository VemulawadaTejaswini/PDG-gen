import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N = 10_000;
    int q;
    int[] ls, rs;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        q = sc.nextInt();
        ls = new int[q]; rs = new int[q];
        for (int i = 0; i < q; i++) {
            ls[i] = sc.nextInt();
            rs[i] = sc.nextInt();
        }
    }

    private void solve() {
        boolean[] sieves = new boolean[N+1];
        sieves[0] = sieves[1] = true;
        for (int i = 2; i <= N; i++) {
            if (!sieves[i]) {
                for (int j = i+i; j <= N; j += i) {
                    sieves[j] = true;
                }
            }
        }
        int[] acc = new int[N+1];
        for (int i = 1; i <= N; i++) {
            if (!sieves[i] && !sieves[(i+1)/2]) acc[i]++;
            acc[i] += acc[i-1];
        }
        for (int i = 0; i < q; i++) {
            System.out.println(acc[rs[i]] - acc[ls[i]-1]);
        }
    }
}
