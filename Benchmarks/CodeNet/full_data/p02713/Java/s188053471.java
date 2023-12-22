import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int ans = 0;
        memo = new int[k + 1][k + 1];
        for(int[] m : memo) Arrays.fill(m, -1);
        for(int a = 1; a <= k; a++) {
            for(int b = 1; b <= k; b++) {
                for(int c = 1; c <= k; c++) {
                    int d = gcd(a, b);
                    ans += gcd(d, c);
                }
            }
        }
        System.out.println(ans);
    }

    static int gcd(int a, int b) {
        if(memo[a][b] != -1) return memo[a][b];
        int l = Math.max(a, b);
        int m = Math.min(a, b);
        while(m > 0) {
            int t = l % m;
            l = m;
            m = t;
        }
        return memo[a][b] = l;
    }
}
