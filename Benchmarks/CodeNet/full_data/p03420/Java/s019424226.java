
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long k = scan.nextInt();
        long sum = 0;
        if(k == 0) {
            System.out.println(n*n);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i <= k) {
                continue;
            }
            sum += (i - (k % i)) * (n / i);
            sum += Math.max(0, n % i - k + 1);
        }
        System.out.println(sum);
    }

}
