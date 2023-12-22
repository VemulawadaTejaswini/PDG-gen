import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        int br = b + r;
        int ans = 0;
        while (n >= br) {
            n -= br;
            ans += b;
        }

        if (n - b > 0) {
            ans += b;
        } else if (n != 0) {
            ans += n;
        }

        System.out.println(ans);
    }
}