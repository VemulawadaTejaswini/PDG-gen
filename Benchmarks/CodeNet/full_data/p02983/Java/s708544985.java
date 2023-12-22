import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        long ans = 2019;
        int limit = Math.min(r, l + 2018);

        for (int i = l; i <= limit - 1; i++) {
            for (int j = l + 1; j <= limit; j++) {
                long value = i * j % 2019;
                ans = Math.min(ans, value);
                if (ans == 0) {
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}