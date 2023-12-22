import java.util.*;
 
public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] freq = new int[10][10];
        for (int i = 1; i <= N; i++) {
            int l = mostLeft(i);
            int r = i%10;
            freq[l][r]++;
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int l = mostLeft(i);
            int r = i%10;
            ans += freq[r][l];
        }

        System.out.println(ans);
    }

    private static int mostLeft(int x) {

        int a = x;
        while (x > 0) {
            a = x;
            x /= 10;
        }

        return a;
    }
}
