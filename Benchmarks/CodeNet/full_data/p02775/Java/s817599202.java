import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String N = sc.next();

        final Solver solver = new Solver();
        solver.solve(N);
    }
}

class Solver {
    public void solve(String N) {
        long ans = 0;
        int up = 0;
        for (int i = N.length() - 1; i >= 0; i--) {
            int d = N.charAt(i) - '0' + up;

            if (d == 10) {
                up = 1;
            }
            else if (d >= 6) {
                up = 1;
                ans += 10 - d;
            }
            else if (d == 5) {
                if (i >= 1) {
                    int n = N.charAt(i - 1) - '0';
                    if (n >= 4) {
                        up = 1;
                        ans += 10 - d;
                    }
                    else {
                        up = 0;
                        ans += d;
                    }
                }
            }
            else {
                up = 0;
                ans += d;
            }
        }
        System.out.println(ans + up);
    }
}

