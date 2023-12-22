import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        long res = 0;
        for (int i = 0; i < N; i++) {
            res = gcd(res, Math.abs(X - Long.parseLong(sc.next())));
        }
        System.out.println(res);
    }

    private static long gcd(long a, long b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}
