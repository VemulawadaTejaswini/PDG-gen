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
        int K = scan.nextInt();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
        }
        long[] sum = new long[N+1];
        for (int i = 0; i < N; i++) {
            sum[i+1] = sum[i] + a[i];
        }
        List<Long> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                list.add(sum[j]-sum[i-1]);
            }
        }
        list.sort(Comparator.reverseOrder());
        long ans = list.get(0);
        for (int i = 1; i < K; i++) {
            ans &= list.get(i);
        }
        System.out.println(ans);
    }
}
