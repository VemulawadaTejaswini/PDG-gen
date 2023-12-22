import java.io.PrintWriter;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    final long mod = 1000000000+7;
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
        out.flush();
//        System.out.println(main.solve());
    }
    // segment tree to record minimum value
    // Each point has a infinite distance from 0 (except itself)
    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        double[] p = new double[n];
        for(int i=0;i<n;i++) p[i]=sc.nextInt();
        double res = 0.0;
        for(int i=0;i<k;i++) res += (p[i]+1.0)/2.0;
        double ans = res;
        for(int end = k;end<n;end++){
            res -= (p[end-k]+1.0)/2;
            res += (p[end]+1)/2.0;
            ans = Math.max(ans,res);
        }
        out.println(ans);
    }
}

