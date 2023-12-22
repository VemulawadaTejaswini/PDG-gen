import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Z-Algorithm or ローリングハッシュが想定解？
 * http://drken1215.hatenablog.com/entry/2019/09/16/014600
 * LCP(Longest Common Prefix)配列をどう求めるかで方針が異なる．
 * LCP Array: https://blog.shibayu36.org/entry/2017/01/06/103956
 */
public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        // test();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        int ans = solveX(N, S);

        System.out.println(ans);
    }
  
    /**
     * 自分の考えた実装に近い．実行時間は決して早くないが(他が300ms, これは1000ms)これで解けるなら十分．
     * https://atcoder.jp/contests/abc141/submissions/7531748
     * @param N
     * @param S
     * @return
     */
    private static int solveX(int N, String S) {
        int count = 0;

        for (int i=0; i<N; i++) {
            for (int j=i+count+1; j<N; j++) {
                if (0 < S.indexOf(S.substring(i, j), j)) {
                    count = j - i;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}