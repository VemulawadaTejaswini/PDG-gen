import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] xz = new int[N];
        for (int i = 0; i < N; i++) {
            xz[i] = sc.nextInt();
        }
        int[] xzDiff = new int[N];
        for (int i = 0; i < N; i++) {
            xzDiff[i] = Math.abs(xz[i] - X);
        }

//        System.out.println(gcd(7,25));

        int divisor = 0;
        if (N == 1){
            System.out.println(Math.abs(xz[0] - X));
            System.exit(0);
        }
        for (int i = 1; i < N; i++) {
            if (i == 1){
                divisor = gcd(xzDiff[i - 1], xzDiff[i]);
            } else {
                divisor = gcd(divisor, xzDiff[i]);
            }
        }
        System.out.println(divisor);
    }

    public static int gcd(int a, int b){
        if (a == 0) return b;
        if (b == 0) return a;

        int tmp = 0;
        if (a > b){
            tmp = a;
            a = b;
            b = tmp;
        }
        return gcd(a, b % a);
    }

}