import java.io.PrintWriter;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    final long max = Long.MAX_VALUE/10;
    int n=1;
    long[] dat;
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }
    // segment tree to record minimum value
    // Each point has a infinite distance from 0 (except itself)
    long solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] co = new double[n][2];
        for(int i=0;i<n;i++){
            double x = sc.nextDouble(), y = sc.nextDouble();
            co[i][0] = x; co[i][1] = y;
        }
        double ans = 0.0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                double[] p1 = co[i], p2 = co[j];
                double dx = p1[0]-p2[0], dy = p1[1]-p2[1];
                double cur = Math.sqrt(dx*dx+dy*dy);
                ans += cur/n;
            }
        }
        System.out.println(ans);
        System.exit(0);
        return 0;
        
    }
}

