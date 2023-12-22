import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int v = i;
            int b = n - i;
            int count = 0;
            while (v > 0) {
                count += v % 10;
                v /= 10;
            }
            while (b > 0) {
                count += b % 10;
                b /= 10;
            }
            ans = Math.min(count, ans);
        }
        System.out.println(ans);
    }
}
