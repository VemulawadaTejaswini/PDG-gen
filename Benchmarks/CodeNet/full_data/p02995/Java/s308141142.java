import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long A = scan.nextLong();
        long B = scan.nextLong();
        long C = scan.nextLong();
        long D = scan.nextLong();
        long gcd = gcd(C, D);
        long lcm = C * D / gcd;
        long countC = B / C - (A - 1) / C;
        long countD = B / D - (A - 1) / D;
        long countLCM = B / lcm - (A-1) / lcm;
        long x = countC + countD - countLCM;
        System.out.println(B-A+1-x);
    }
    public long gcd(long x, long y) {
        if (x > y) {
            long t = x;
            x = y;
            y = t;
        }
        while (x % y != 0) {
            long t = y;
            y = x % y;
            x = t;
        }
        return y;
    }
}
