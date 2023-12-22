import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        BigInteger ans = BigInteger.valueOf(a[0]);
        for (int i = 1; i < n; i++) {
            ans = ans.gcd(BigInteger.valueOf(a[i]));
        }
        System.out.println(ans);
    }
}