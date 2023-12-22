import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long INF = 2_000_000_000_000_000_000L;
        int N = Integer.parseInt(sc.next());
        long C = Long.parseLong(sc.next());
        long[] x = new long[2*N];
        long[] v = new long[2*N];
        for (int i=0;i<N;i++) {
            x[i] = Long.parseLong(sc.next());
            x[i+N] = x[i]+C;
            v[i] = Long.parseLong(sc.next());
            v[i+N] = v[i];
        }
        long[] profit = new long[2*N];
        profit[N-1] = v[N-1]-(C-x[N-1]);
        profit[N] = v[N]-(x[N]-C);
        for (int i=N-2;i>=0;i--) {
            profit[i] = profit[i+1] + v[i]-(x[i+1]-x[i]);
        }
        for (int i=N+1;i<2*N;i++) {
            profit[i] = profit[i-1] + v[i]-(x[i]-x[i-1]);
        }

        // serach index
        int[] max_index = new int[2*N];
        max_index[N]=N;
        max_index[N-1]=N-1;
        for (int i=N+1;i<2*N;i++) {
            if (profit[max_index[i-1]]<profit[i]) {
                max_index[i]=i;
            } else {
                max_index[i]=max_index[i-1];
            }
        }
        for (int i=N-2;i>=0;i--) {
            if (profit[max_index[i+1]]<profit[i]) {
                max_index[i]=i;
            } else {
                max_index[i]=max_index[i+1];
            }
        }

        long ans=0L;
        ans = Math.max(ans, profit[2*N-1]);
        ans = Math.max(ans, profit[0]);
        for (int i=N;i<2*N-1;i++) {
            long tmp = profit[i];
            ans = Math.max(ans, tmp);
            ans = Math.max(ans, tmp+profit[max_index[i-N+1]]-(x[i]-C));
        }
        for (int i=N-1;i>0;i--) {
            long tmp = profit[i];
            ans = Math.max(ans, tmp);
            ans = Math.max(ans, tmp+profit[max_index[i+N-1]]-(C-x[i]));
        }
        System.out.println(ans);
    }
}