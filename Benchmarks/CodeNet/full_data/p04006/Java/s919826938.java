import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long x = in.nextLong();
        long[] a = new long[n];
        long[] min = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = min[i] = in.nextLong();
        }
        long ans = Arrays.stream(min).sum();
        for(int k = 1; k < n; k++) {
            long[] tmp = new long[n];
            for (int i = n; i < n*2; i++) {
                tmp[i%n] = Math.min(min[i%n], a[(i-k)%n]);
            }
            ans = Math.min(ans, Arrays.stream(tmp).sum() + (long)k * x);
            min = Arrays.copyOf(tmp, tmp.length);
        }
        System.out.println(ans);
    }
}   