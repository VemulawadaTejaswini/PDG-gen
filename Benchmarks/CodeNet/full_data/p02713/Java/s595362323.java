import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long res = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= k; l++) {
                    res += gcd(i, gcd(j, l));
                }
            }
        }

        System.out.println(res);
    }
    static int[][] memo = new int[201][201];
    private static int gcd(int m, int n) {
        if(memo[m][n] > 0) return memo[m][n];
        if(m < n) return memo[m][n] = gcd(n, m);
        if(n == 0) return m;
        return memo[m][n] = gcd(n, m % n);
    }

}