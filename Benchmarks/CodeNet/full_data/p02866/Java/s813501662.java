import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (sc.nextInt() != 0) {
            System.out.println(0);
            return;
        }

        long ans = 1;

        for (int i = 1; i < n; i++) {
            ans *= sc.nextInt();
            ans %= 998244353;
        }

        System.out.println(ans);
    }
}