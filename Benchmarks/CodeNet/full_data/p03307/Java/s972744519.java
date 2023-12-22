import java.net.SecureCacheResponse;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long ans = 0;
        for (long i = n; i <= Integer.MAX_VALUE; i++) {
            if (i % 2 == 0 && i % n == 0) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
