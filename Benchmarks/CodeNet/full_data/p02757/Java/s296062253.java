import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Divisible Substring
 * 
 * https://atcoder.jp/contests/abc158/tasks/abc158_e
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        int P = sc.nextInt();
        String S = sc.next();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = S.charAt(i) - '0';
        }

        long ans = 0;
        int m = 0;
        int k = 1;
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);
        for (int i = N - 1; i >= 0; i--) {
            m = (A[i] * k + m) % P;

            Integer c = count.get(m);

            if (c == null) {
                c = 1;
            } else {
                ans += c;
                c++;
            }

            count.put(m, c);

            k = (k * 10) % P;
        }

        System.out.println(ans);
    }

}
