import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        String Pstr;
        Pstr = sc.next();
        String S;
        S = sc.next();

        final Solver solver = new Solver();
        solver.solve(N, Pstr, S);
    }
}

class Solver {
    public Map<String, Boolean> dividable = new HashMap<>();

    public void solve(long N, String Pstr, String S) {
        BigInteger P = new BigInteger(Pstr);

        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                String sub = S.substring(i, j);
                if (isDividable(sub, P)) ans++;
            }
        }
        System.out.println(ans);
    }

    public boolean isDividable(String d, BigInteger P) {
        if (!dividable.containsKey(d)) {
            BigInteger b = new BigInteger(d);
            dividable.put(d, b.remainder(P).equals(BigInteger.ZERO));
        }

        return dividable.get(d);
    }
}

