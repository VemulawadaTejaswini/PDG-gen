import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        Long[] A = new Long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
        }

        long sum = solve(N, K, A);
        System.out.println(sum);
    }

    public static long solve(int n, int k, Long[] a) {
        Arrays.sort(a, Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            a[0] = a[0] / 2;
            Arrays.sort(a, Comparator.reverseOrder());
        }

        long sum = 0L;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }
}

