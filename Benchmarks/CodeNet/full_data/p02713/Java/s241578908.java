import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int K = stdIn.nextInt();
        stdIn.close();
        
        long sum = 0;
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                for (int k = 1; k <= K; k++) {
                    sum += gcd(gcd(i, j), k);
                }
            }
        }
        
        System.out.println(sum);
    }

    // GCDメソッド
    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}