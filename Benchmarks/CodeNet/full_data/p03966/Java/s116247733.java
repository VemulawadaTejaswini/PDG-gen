import java.util.*;
import java.io.*;
public class Main {
    static long gcd(long a, long b) {
        if (a < b) {
            long t = a;
            a = b;
            b = t;
        }
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());
        StringTokenizer st;
        long first = 1;
        long second = 1;
        for (int i = 1; i <= times; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if ((first % n) != 0) {
                if (n > first) first = n;
                else {
                    first = n * (first / n) + n;
                }
            }
            if (second % m != 0) {
                if (m > second) second = m;
                else
                    second = (second / m) * m + m;
            }
            long gcd = gcd(first, second);
            if ((first / n) * m  > second)
                second = (first / n)* m;
            if ((first / n) * m < second)
                first = (second / m) * n;
        }
        System.out.print(first + second);
    }
}