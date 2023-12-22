import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lis = new int[n];

        for (int i = 0; i < n; ++i) {
            lis[i] = sc.nextInt();
        }
        int[] sorted = Arrays.copyOf(lis, n);
        Arrays.sort(sorted);

        for (int i = 0; i < n; ++i) {
            if (sorted[n-1] == lis[i]) {
                System.out.println(sorted[n-2]);
            } else {
                System.out.println(sorted[n-1]);
            }
        }
    }
}
