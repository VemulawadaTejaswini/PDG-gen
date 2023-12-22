import java.util.Scanner;

/* https://atcoder.jp/contests/arc098/submissions/2815966 を参考に作成 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextLong();
        }

        long xorSum = 0;
        long ans = 0;
        for(int r = 0; r < n; ++r) {
            
            for(int s = r + 1; s < n; ++s) {
                xorSum = a[r] ^ a[s];
                ans = ans + xorSum;
            }
        }

        //System.out.println(ans);
        System.out.println(ans % (Math.pow(10 , 9) + 7));
    }
}
