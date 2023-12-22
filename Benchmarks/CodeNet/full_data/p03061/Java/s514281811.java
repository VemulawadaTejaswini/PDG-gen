import java.util.Scanner;

class Solver {
    public void Solve() {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] gcdl = new int[n];
        int[] gcdr = new int[n];
        gcdl[0] = a[0];
        for (int i = 1; i < gcdr.length; i++) {
            gcdl[i] = gcd(gcdl[i - 1], a[i]);
        }
        gcdr[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            gcdr[i] = gcd(gcdr[i + 1], a[i]);
        }

        // 端を使わない場合
        int max = Math.max(gcdr[1], gcdl[n - 2]);
        for (int i = 0; i < gcdr.length - 2; i++) {
            int ans = gcd(gcdl[i], gcdr[i + 2]);
            max = Math.max(ans, max);
        }
        System.out.println(max);

    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }

    int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        if (a < b) {
            return gcd(b, a);
        }
        return gcd(b, a % b);
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
