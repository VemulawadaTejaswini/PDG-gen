import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        //二辺の組み合わせを総当たり
        long ans = Long.MAX_VALUE;
        for (int hl = 0 ; hl < n ; hl++) {
            for (int hr = hl + 1 ; hr < n ; hr++) {
                for (int wl = 0 ; wl < n ; wl++) {
                    for (int wr = wl + 1 ; wr < n ; wr++) {
                        long l = Math.min(x[wl], x[wr]);
                        long r = Math.max(x[wl], x[wr]);
                        long d = Math.min(y[hl], y[hr]);
                        long u = Math.max(y[hl], y[hr]);
                        int count = 0;
                        for (int i = 0 ; i < n ; i++) {
                            if (x[i] >= l && x[i] <= r && y[i] >= d && y[i] <= u ) {
                                count++;
                            }
                        }
                        if (count == k) ans = Math.min(ans, (r - l) * (u - d) );
                    }
                }
            }
        }

        System.out.println(ans);

    }

}