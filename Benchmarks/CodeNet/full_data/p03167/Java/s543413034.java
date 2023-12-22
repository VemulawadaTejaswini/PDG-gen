
import java.util.*;

public class Main {// Main
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n =sc.nextInt();
		int m = sc.nextInt();
		
		char [][] ch = new char[n][m];
		for(int i = 0 ;i < n;i++) {
			String str = sc.next();
			for(int j = 0 ;j < m;j++) {
				ch[i][j] = str.charAt(j);
			}
		}
		
		long dp[][] = new long[n+1][m+1];
		dp[n-1][m] = 1;
		long mod = 1000000007L;
		for(int i = n-1 ; i>=0 ;i--) {
			for(int j = m-1 ;j >=0 ;j--) {
				if(ch[i][j]=='#')continue;
				dp[i][j] = (dp[i+1][j] + dp[i][j+1]) % mod ;
			} 
		}
		
  System.out.println(dp[0][0]);
	}
	
	

	static TreeMap<Integer , ArrayList<Integer> > map ;

	public static TreeMap<Integer , ArrayList<Integer> > directed(int n , int m  ) throws Exception{
		TreeMap<Integer , ArrayList<Integer> > map = new TreeMap<>();
		for(int i = 1 ;i<=n ;i++)map.put(i, new ArrayList<Integer>());
		for(int i = 1 ;i <= m ;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.get(a).add(b);
		}
		return map;
	}
}