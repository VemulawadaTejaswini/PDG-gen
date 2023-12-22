import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        int[] cnt = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
            cnt[d[i]]++;
        }

        Arrays.sort(d);

        long ans = 1;
        if (d[0] != 0 || cnt[0] != 1) {
            System.out.println(0);
            sc.close();
            return;
        } else {
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < cnt[i]; j++) {
                    ans *= cnt[i - 1];
                    ans %= 998244353;
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}