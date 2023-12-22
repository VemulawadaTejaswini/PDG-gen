import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long M = scan.nextLong();
        long[] A = new long[N];
        long count_odd = 0;
        long count_even = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong()/2;
            if (A[i] % 2 == 1) {
                count_odd += 1;
            } else {
                count_even += 1;
            }
        }
        if (count_odd % 2 == 0) {
            System.out.println(0);
        }
        long lcm = lcm(A);
        if (lcm % 2 == 0) {
            long count = M / lcm;
            if (count % 2 == 1) {
                count += 1;
            }
            System.out.println(count / 2 - 1);
        } else {
            long count = M / lcm;
            if (count % 2 == 1) {
                count += 1;
            }
            System.out.println(count / 2);
        }
    }
    public long lcm(long[] T) {
        long current_lcm = T[0];
        for (int i = 0; i < T.length; i++) {
            current_lcm = lcm(T[i], current_lcm);
        }
        return current_lcm;
    }
    public long lcm(long x, long y) {
        long gcd = gcd(x, y);
        return x/gcd*y;
    }
    private long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);

    }
}
