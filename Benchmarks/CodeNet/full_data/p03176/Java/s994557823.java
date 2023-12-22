public class Main {
	
	private static final int MAX_N = 200002;
    static long dp[] = new long[MAX_N];
    static long bit[] = new long[MAX_N];

	public static void main(String[] args) {
		
		try {
		    
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String nLine = br.readLine();
		      String hLine = br.readLine();
		      String aLine = br.readLine();
		      int n = Integer.parseInt(nLine);
		      
		      String[] heights = hLine.split(" ");
		      String[] beautyLine = aLine.split(" ");
		      
		      for(int i = 1; i <= n ; i++) {
		    	  int ht = Integer.parseInt(heights[i-1]);
		    	  dp[i] = query(ht-1) + Integer.parseInt(beautyLine[i-1]);
		    	  update(ht, dp[i], n);
		      }
		      
		      long maxBeautySum = 0;
		      
		      for(int i = 1; i <= n ; i++) {
		    	  maxBeautySum = Math.max(maxBeautySum, dp[i]);
		      }

		      System.out.println(maxBeautySum);
		      
		    } catch(Exception ex) {
		    	System.out.println("Error is " + ex);
		    }

	}
	
	private static long query(int ht) {
		long answer = 0;
		while(ht > 0) {
			answer = Math.max(answer, bit[ht]);
			ht -= (ht&(-ht));
		}
		return answer;
	}
	
	private static void update(int ht, long val, int n) {
		while(ht <= n) {
			bit[ht] = Math.max(val, bit[ht]);
			ht += (ht&(-ht));
		}
	}