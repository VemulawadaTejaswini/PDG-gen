import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] p = new long[n + 1];
        p[0] = 1;
        for (int i = 0; i < n; i++) {
            p[i + 1] = (p[i] * (i + 1)) % 1000000007;
        }
        System.out.println(p[n]);
    }
}
