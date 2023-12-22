import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, X;
        N = scan.nextInt();
        X = scan.nextInt();
        int [] dif = new int[N];
        for (int i = 0; i < N; i++) {
            dif[i] = Math.abs(scan.nextInt() - X);
        }
        
        int ans = N == 1 ? dif[0] : gcd(dif[1], dif[0]);
        for (int i = 2; i < N; i++) {
            ans = gcd(dif[i], ans);
        }
        System.out.println(ans);
    }
    
    public static int gcd(int a, int b) {
        if (b > 0) {
            return gcd(b, a % b);
        }
        else {
            return a;
        }
    }
}