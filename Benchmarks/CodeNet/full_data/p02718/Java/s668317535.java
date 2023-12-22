import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        double[] A = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        double sum = Arrays.stream(A).sum();
        double p = 4 * M;
        double limit = sum / p;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < limit) {
                continue;
            }
            count += 1;
        }
        System.out.println(M <= count ? "Yes" : "No");
    }
}
