import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int x = stdin.nextInt();
        int ans = 3 * (n - gcd(x, n));
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        int mod;
        while ((mod = b % a) > 0) {
            a = mod;
            b = a;
        }
        return a;
    }
}
