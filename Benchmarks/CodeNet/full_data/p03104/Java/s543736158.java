import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long a = scan.nextLong() - 1;
        long b = scan.nextLong();
        String A = Long.toBinaryString(a);
        String B = Long.toBinaryString(b);
        long range = b - a + 1;
        int A_len = A.length();
        int B_len = B.length();
        if (A_len < B_len) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < B_len - A_len; i++) {
                sb.append("0");
            }
            sb.append(A);
            A = sb.toString();
        }
        long[] a_bit = new long[B_len];
        long[] b_bit = new long[B_len];
        StringBuilder sb = new StringBuilder();
        long x = 1;
        for (int i = 0; i < B_len; i++) {
            if (a < 0) {
                break;
            }
            x *= 2;
            a_bit[i] = Math.floorDiv(a,  x) * x / 2 + Math.min(x / 2, a % x);
            a -= x / 2;
        }
        x = 1;
        for (int i = 0; i < B_len; i++) {
            if (b < 0) {
                break;
            }
            x *= 2;
            b_bit[i] = Math.floorDiv(b,  x) * x / 2 + Math.min(x / 2, b % x);
            b -= x / 2;
        }
        for (int i = B_len - 1; 0 <= i; i--) {
            if ((b_bit[i] - a_bit[i]) % 2 == 1) {
                sb.append("1");
                continue;
            }
            sb.append("0");
        }
        String answer = sb.toString();
        System.out.println(Long.parseLong(answer, 2));
    }
}
