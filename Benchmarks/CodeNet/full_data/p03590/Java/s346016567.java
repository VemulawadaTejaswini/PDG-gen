import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] a = new long[N];
        long[] b = new long[N];
        for ( int i = 0; i < N; i++ ) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }
        List<Long> ks = orListUnder(K);
        long ans = 0;
        for (int i = 0, n = ks.size(); i < n; i++) {
            long k = ks.get(i);
            long tempans = 0;
            for ( int j = 0; j < N; j++ ) {
                if ( (a[j] | k) == k ) {
                    tempans += b[j];
                }
            }
            ans = Math.max(ans, tempans);
        }
        System.out.println(ans);
    }

    private static List<Long> orListUnder(long K) {
            List<Long> ks = new ArrayList<>();
            for ( long k = 0; k<=K; k++ ) {
                ks.add(k);
            }
            return ks;
    }
}