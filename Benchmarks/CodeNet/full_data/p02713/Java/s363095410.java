
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        long K = scan.nextLong();

        long ans = 0;

        for(int i = 1; i <= K; i++) {
            for(int j = 1; j <= K; j++) {
                long gcd1 = gcd(i, j);
                for(int k = 1; k <= K; k++) {
                    long gcd2 = gcd(gcd1, k);
                    ans += gcd2;
                }
            }
        }

        os.println(ans);

    }

    static public long gcd(long a, long b) {
        if(a > b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        while(a > 0) {
            long tmpa = a;
            a = b % a;
            b = tmpa;
        }
        return b;
    }
}