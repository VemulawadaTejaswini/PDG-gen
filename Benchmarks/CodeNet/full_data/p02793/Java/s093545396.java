import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long lcm = 1;
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
            long gcd = gcd(lcm, a[i]);
            lcm = lcm * a[i] / gcd;
        }
        long result = 0;
        for(int i=0; i<n; i++) {
            result += lcm / a[i];
            result %= 1000000007;
        }
        System.out.println(result);
    }
    private static long gcd(long a, long b) {
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
