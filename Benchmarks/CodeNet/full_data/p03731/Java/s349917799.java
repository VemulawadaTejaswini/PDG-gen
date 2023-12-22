import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long t = sc.nextLong();

        long start = sc.nextInt();
        long ans = t;

        for (int i = 1; i < n; i++) {
            long value = sc.nextLong();
            ans += Math.min(t, value - start);
            start = value;
        }

        System.out.println(ans);
    }
}
