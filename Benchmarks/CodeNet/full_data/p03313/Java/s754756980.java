import java.io.PrintWriter;
import java.util.*;

public class Main {
    static int[] bit;
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = 1<<m; // definition of n is different from in the question
        int[][] dp = new int[n][2];
        int[] A = new int[n];
        int[] ans = new int[n];
        for(int i=0;i<n;i++) A[i] = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(10,(Integer a, Integer b)->A[a]-A[b]);
        HashSet<Integer> record = new HashSet<>();
        PrintWriter out = new PrintWriter(System.out);
        for(int k=1;k<n;k++){
            record.clear();
            pq.clear();
            // option 1: directly come from k-1
            // option 2: i|j==k
            record.add(0);record.add(k);
            pq.add(0);pq.add(k);
            for(int i=1<<19;i>=1;i=i/2){
                if((i&k)==0) continue;
                for(int w:dp[i^k]){
                    if(record.add(w)) pq.add(w);
                }
            }
            while(pq.size()>2) pq.poll();
            dp[k][0] = pq.poll();
            dp[k][1] = pq.poll();
            int res = Math.max(ans[k-1],A[dp[k][0]]+A[dp[k][1]]);
            ans[k] = res;
            out.println(res);
        }
        out.flush();
    }
}