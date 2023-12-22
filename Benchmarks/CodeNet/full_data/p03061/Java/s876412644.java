import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        int ret = 0;
        for (int k = 0; k < n; k++) {
            List<String> list = new ArrayList<>(Arrays.asList(a));
            list.remove(k);
            String[] removed = list.toArray(new String[]{});

            BigInteger gcd = BigInteger.valueOf(Integer.parseInt(removed[0]));
            for (int j = 1; j < removed.length; j++) {
                gcd = BigInteger.valueOf(Integer.parseInt(removed[j])).gcd(gcd);
            }
            ret = Math.max(ret,gcd.intValue());
        }
        System.out.printf(String.valueOf(ret));
    }
}
