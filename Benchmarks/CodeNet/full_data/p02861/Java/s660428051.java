import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] x = new long[(int)(N)];
        long[] y = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                x[i] = sc.nextLong();
                y[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, x, y);
    }
}

class Solver {
    public void solve(long N, long[] x, long[] y) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            builder.append(i);
        }

        List<String> permutations = new LinkedList<>();
        allPermutations("", builder.toString(), permutations);

        double total = 0.0;
        for (String pattern : permutations) {
            for (int i = 0; i < pattern.length() - 1; i++) {
                int from = pattern.charAt(i) - '1';
                int to = pattern.charAt(i + 1) - '1';

                double inside = Math.pow(x[from] - x[to], 2.0) + Math.pow(y[from] - y[to], 2.0);
                total += Math.sqrt(inside);
            }
        }
        System.out.println(total / kaijo(N));
    }

    private long kaijo(long n) {
        if (n == 1) return 1;
        return n * kaijo(n - 1);
    }

    private void allPermutations(String prefix, String str, List<String> ans) {
        int n = str.length();
        if (n == 1) {
            ans.add(prefix + str);
        }
        else {
            for (int i = 0; i < n; i++)
                allPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1), ans);
        }
    }
}

