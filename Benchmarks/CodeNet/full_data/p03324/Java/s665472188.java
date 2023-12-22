import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += Math.pow(100, d);
        }

        System.out.println(ans);
    }
}
