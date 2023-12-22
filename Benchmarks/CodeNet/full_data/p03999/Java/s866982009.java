import java.util.*;

public class Main {
    private static final int N_MAX = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] in = sc.next().chars().map(i -> i -'0').toArray(); int n = in.length;
        long ans = 0;
        for (int i=0; i<(1<<n-1); i++) {
            int last = in[0];
            for (int j=1; j<n; j++) {
                if (((i>>(j-1) & 1) == 1)) {
                    ans += last;
                    last = 0;
                }
                last = 10 * last + in[j];
            }
            ans += last;
        }
        System.out.println(ans);
    }
}