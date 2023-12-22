
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n;
    int[] as;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        as = new int[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextInt();
    }

    private void solve() {
        long ans = 1L;
        for (int i = 0; i < n; i++){
            if (as[i] % 2 == 0) {
                ans *= 2;
            }
        }
        long tmp = (long)Math.pow(3, n);
        System.out.println(tmp - ans);
    }
}
