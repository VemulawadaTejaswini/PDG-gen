    import java.util.*;
    public class Main {
    	public static void main(String[] args) {
    		Scanner s = new Scanner(System.in);
    		int n = s.nextInt();
    		int[] h = new int[n];
    		for (int i = 0; i < n  ; i++ ) {
    			h[i] = s.nextInt();
    		}
          int[] dp = new int[n];
          Arrays.fill(dp, -1);
          System.out.println(calc(h, 0, dp));
    	}
    	public static int calc(int[] h, int pos, int[] dp) {
    		if(pos > h.length){
              return 0
            }
          if(dp[pos] != -1){
            return dp[pos];
          }
          return dp[pos]= Math.min( calc(h, pos+1) + Math.abs(h[pos] - h[pos+1]),
                          calc(h, pos+2) + Math.abs(h[pos] - h[pos+2]));
          
    	}
    }