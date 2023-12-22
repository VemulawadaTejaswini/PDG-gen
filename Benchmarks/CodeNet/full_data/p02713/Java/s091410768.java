
import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author azize
   
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int sum = 0;
        for (int a = 1; a <= k; ++a) {
            for (int b = 1; b <= k; ++b) {
                for (int c = 1; c <= k; ++c) {
                    sum += gcd(a, b, c);
                }
            }
        }

        out.println(sum);
    }

    public int gcd(int a, int b, int c) {
        return gcd(a, gcd(b, c));
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
