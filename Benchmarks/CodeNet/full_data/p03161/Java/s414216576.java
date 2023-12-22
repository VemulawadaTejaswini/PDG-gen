import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] h = new long[N];
        for(int n=0; n<N; n++) h[n]=sc.nextLong();

        long[] cost = new long[N];
        Arrays.fill(cost, 5000000000000000L);
        cost[0]=0;

        for(int n=1; n<N;n++){
            for(int k=1;k<=K;k++) if(n-k>=0) {
                cost[n] = Math.min(cost[n], cost[n-k]+Math.abs(h[n]-h[n-k]));
            }
        }

        System.out.println(cost[N-1]);
    }
}
