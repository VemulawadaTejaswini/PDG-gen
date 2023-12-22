import java.util.Scanner;

class Solver {
    public void Solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (n < k) {
            long ans = Math.min(k - n, n);
            System.out.println(ans);
            return;
        }
        long ans = n % k;
        if (ans < k) {
            ans = Math.min(k - ans, ans);
            System.out.println(ans);
            return;
        }
    }

    private static long gcd(long m, long n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
