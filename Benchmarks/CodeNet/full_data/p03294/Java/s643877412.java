import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];

        long x = 1;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
            x *= a[i];
        }
        x--;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += x % a[i];
        }
        System.out.println(ans);
    }
}
