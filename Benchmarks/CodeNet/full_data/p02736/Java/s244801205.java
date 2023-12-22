import java.util.*;

public class Main {
    private static char[] a;
    private static Map<String, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        a = sc.next().toCharArray();
        int ans = calc(0, N-1);

        System.out.println(ans);
    }

    private static int calc(int l, int r) {
        if (r-l == 1) {
            return Math.abs(a[l]-a[r]);
        }

        StringBuffer b = new StringBuffer();
        for (int i = l; i <= r; i++) {
            b.append(a[i]);
        }
        String key = b.toString();
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int ret = Math.abs(calc(l, r-1)-calc(l+1, r));

        String keyRev = b.reverse().toString();

        memo.put(key, ret);
        memo.put(keyRev, ret);
 
        return ret;
    }
}

