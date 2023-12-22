
import java.util.Scanner;

public class Main {
    public static boolean isOk(long n, long k) {
        while (n % k == 0) {
            n = n / k;
        }
        return n % k == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        // nがkで割り切れるとき
        int ans = 1;  // n = k の場合のぶん
        for (long k = 2; k * k <= n; k++) {
            if(n % k == 0){
                if (isOk(n, k)) {
                    ans++;
                }
                // n/kもnの約数なので同時に計算
                if (n/k != k && isOk(n, n/k)){
                    ans++;
                }
            }
        }
        // nがkでわり切れない時
        if (n > 2){
            ans++;  // k = n - 1の場合のぶん
            for (long k = 2; k * k <= n-1; k++) {
                if ((n - 1) % k == 0) {
                    ans ++;
                    // (n-1)/kもn-1の約数なので同時に計算
                    if ((n - 1) / k != k){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
