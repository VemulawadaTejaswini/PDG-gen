import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            x.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(x);

        int ans = Integer.MAX_VALUE;
        for (int i = 2; i < x.size(); i++) {
            int candidate = gcd(x.get(i - 1) - x.get(i - 2), x.get(i) - x.get(i - 1));
            if (candidate < ans) {
                ans = candidate;
            }
        }

        // n == 1のときだけ特別扱いが必要
        if (n == 1) {
            ans = x.get(1) - x.get(0);
        }

        System.out.println(ans);
    }

    // greatest common divisor
    static int gcd(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
