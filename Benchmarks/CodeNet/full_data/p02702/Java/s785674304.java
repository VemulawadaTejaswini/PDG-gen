import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char[] s = str.toCharArray();
        int n = s.length;
        int p = 2019;

        long ans = 0;
        int now = 0;
        int base = 1;
        int[] cnt = new int[p];
        cnt[0] = 1;

        for (int i = n - 1; i >= 0; i--) {
            int x = Integer.parseInt(String.valueOf(s[i]));
            x *= base;
            x %= p;
            now += x;
            now %= p;
            ans += cnt[now];
            cnt[now]++;
            base *= 10;
            base %= p;
        }

        System.out.println(ans);

    }

}