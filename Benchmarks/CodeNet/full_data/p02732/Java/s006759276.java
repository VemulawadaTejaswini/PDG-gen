import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            A[i]--;
        }

        final int[] cnt = new int[N];
        for (int i = 0; i < N; i++) {
            cnt[A[i]]++;
        }

        int total = IntStream.of(cnt).map(Main::choose2).sum();

        for (int i = 0; i < N; i++) {
            long ans = total;
            ans -= choose2(cnt[A[i]]);
            ans += choose2(cnt[A[i]]-1);
            System.out.println(ans);
        }
    }

    private static int choose2(int n) {
        return n * (n - 1) / 2;
    }
}
