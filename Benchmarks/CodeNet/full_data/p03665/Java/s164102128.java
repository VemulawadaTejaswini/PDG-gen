import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if ( even == n) {
            if (p == 0) {
                System.out.println((long)Math.pow(2, n));
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println((long) Math.pow(2, n-1));
        }

    }
}
