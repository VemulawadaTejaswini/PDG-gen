import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static final long MOD = 1000000007;
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] dam = new int[N];
        String[] split = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            dam[i] = Integer.parseInt(split[i])* 2;
        }
        final long damSum = sum(dam) / 2L;

        int low = 0;
        int high = dam[0];
        int cnt = 0;
        while(cnt++ <= 100) {
            int val = (high + low) / 2;
            int[] mou = createMou(N, val, dam);
            final long sum = sum(mou);
            if (sum == damSum) {
                System.out.println(String.join(" ", Arrays.stream(mou).mapToObj(Integer::toString).collect(Collectors.toList())));
                return;
            } else if (sum > damSum) {
                low = val;
            } else {
                high = val;
            }
        }
        int val = (high + low) / 2;
        for (int i = val - 50; i < val + 50; i++) {
            if (i < 0) continue;
            int[] mou = createMou(N, i, dam);
            final long sum = sum(mou);
            if (sum == damSum) {
                System.out.println(String.join(" ", Arrays.stream(mou).mapToObj(Integer::toString).collect(Collectors.toList())));
                return;
            }
        }
        System.out.println("WA");
    }

    private static long sum(int[] a) {
        long ret = 0;
        for (int i = 0; i < a.length; i++) {
            ret += a[i];
        }
        return ret;
    }

    private static int[] createMou(final int n, final int val, int[] dam) {
        int[] mou = new int[n];
        mou[0] = val;
        for (int i = 1; i < n-1; i++) {
            int j = (i-1+n)%n;
            mou[i] = dam[j]-mou[j];
        }
        mou[n-1] = dam[n-1]-mou[0];
        return mou;
    }
}
