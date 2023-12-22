import java.net.SecureCacheResponse;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        int countSum = 0;
        for (int i = n; i > 0; i--) {
            int count = 0;
            for (int j = i; j > 0; j--) {
                if (i % j == 0) count++;
            }
            if (count == 8 && i % 2 == 1) {
                countSum++;
            }
        }

        System.out.println(countSum);
    }
}
