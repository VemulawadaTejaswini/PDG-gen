import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String S = sc.next();

        final Solver solver = new Solver();
        solver.solve(N, S);
    }
}

class Solver {
    public void solve(int N, String X) {
        int ans = 0;
        int cur = 'a';
        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (cur == c) {
                cur++;
                if (cur > 'c') {
                    ans++;
                    cur = 'a';
                }
            }
            else {
                cur = 'a';
            }
        }
        System.out.println(ans);
    }
}

