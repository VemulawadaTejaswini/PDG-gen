import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] T = new long[N];
        for (int i = 0; i < N; i++) {
            T[i] = sc.nextLong();
        }
        System.out.println( solve(N, T) );
    }

    private static long solve(int N, long[] T) {
        long ans = T[0];
        for (int i = 1; i < N; i++) {
            ans = lcm(ans, T[i]);
        }
        return ans;
    }

    private static long lcm(long a, long b) {
        long g = gcd(a, b);
        return (a / g) * (b / g) * g;
    }

    private static long gcd(long a, long b) {
        while(b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}