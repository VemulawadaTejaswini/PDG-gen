import java.util.Scanner;

class Solver {
    public void Solve() {
        long n = sc.nextLong();
        long b = sc.nextLong();
        long r = sc.nextLong();
        long sum = b + r;
        long ans = 0;
        if (b == 0) {
            System.out.println(0);
            return;
        }
        ans += n / sum * b;
        if (n % sum != 0) {
            long res = (n - (n / sum) * sum);
            ans += Math.min(res, b);
        }
        System.out.println(ans);
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
