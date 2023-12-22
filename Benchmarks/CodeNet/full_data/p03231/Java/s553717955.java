import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        long N = Long.parseLong(line[0]);
        long M = Long.parseLong(line[1]);
        String[] S = br.readLine().split("");
        String[] T = br.readLine().split("");

        long lcm = lcm(N, M);
        long res = lcm;
        Set<Long> setN = new HashSet<>();
        Set<Long> setM = new HashSet<>();
        long n = lcm / N;
        long m = lcm / M;

        for (long i = 0; i < N; i++) {
            setN.add(n * i + 1);
        }
        for (long i = 0; i < M; i++) {
            setM.add(m * i + 1);
        }
        for (long i: setN) {
            if (setM.contains(i)) {
                if (!S[(int)((i - 1) / n)].equals(T[(int)((i - 1) / m)])) {
                    res = - 1;
                    break;
                }
            }
        }
        out.println(res);
        out.close();
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);    
    }

    private static long gcd(long m, long n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
