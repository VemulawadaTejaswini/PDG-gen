import java.util.Scanner;
public class Main
{
    private static class Pair{
        int source;
        int sink;
        
        Pair(int s, int si){
            source = s;
            sink = si;
        }
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    long[] dp = new long[N+1];
	    Pair[] edges = new Pair[M];
	    for(int i = 0; i < M; i++){
	        int source = sc.nextInt();
	        int sink = sc.nextInt();
	        edges[i] = new Pair(source, sink);
	        dp[sink] = Math.max(dp[source] +1, dp[sink]);
	    }
	    
	    for(Pair p: edges){
	        dp[p.sink] = Math.max(dp[p.source] + 1, dp[p.sink]);
	    }
	    
	    long ans = 0;
	    for(int i =0; i<= N; i++){
	        ans = Math.max(dp[i], ans);
	    }
	    
	    System.out.println(ans);
	}
}
