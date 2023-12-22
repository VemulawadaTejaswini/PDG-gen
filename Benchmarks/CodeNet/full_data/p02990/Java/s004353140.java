import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int MOD = 1000000007;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        long ans = n - k + 1;
        System.out.println(ans);
        for(int i = 1; i < k; i++) {
            ans = ans * (n - k - i + 1) * (k - i) / (i + 1) / i;
            System.out.println(ans % MOD);
        }
    }
}