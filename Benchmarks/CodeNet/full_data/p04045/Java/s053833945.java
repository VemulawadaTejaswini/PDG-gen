import java.util.*;
public class Main {
    static boolean[] b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        b = new boolean[10];
        Arrays.fill(b, true);
        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            b[d] = false;
        }
        for (;;n++) {
            if (check(n)) {
                System.out.println(n);
                return;
            }
        }
    }
    public static boolean check(int n) {
        boolean ret = true;
        while (n > 0) {
            if (!b[n % 10]) ret = false;
            n /= 10;
        }
        return ret;
    }
}