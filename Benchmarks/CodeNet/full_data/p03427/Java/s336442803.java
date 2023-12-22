import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n < 10) {
            System.out.println(n);
            return;
        }

        long ans = 0;
        while (n > 0) {
            if (n < 10) {
                ans += n -1;
                break;
            }
            ans += 9;
            n /= 10;
        }
        System.out.println(ans);
    }
}