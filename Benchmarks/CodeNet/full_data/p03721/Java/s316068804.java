import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a[] = new int[N];
        int b[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i][0] = a[i];
            b[i][1] = sc.nextInt();
        }
        Arrays.sort(a);
        int i = 0;
        while (true) {
            int ans = a[i];
            for (int j = 0; j < N; j++) {
                if (ans == b[i][0] && b[i][1] > 0) {
                    K -= b[i][1];
                    b[i][1] = 0;
                    if (K <= 0) {
                        System.out.println(b[i][0]);
                        return;
                    }
                    i++;
                    break;
                }
            }
        }
    }

}
