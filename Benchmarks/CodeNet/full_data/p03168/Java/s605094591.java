import java.util.*;

public class Main {// Main
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n =sc.nextInt();
		double [] ar = new double[n];
		double[][] dp = new double[n][n+1];
		for(int i = 0 ;i < n;i++)ar[i]=sc.nextDouble();
		dp[0][0] = (1 - ar[0]);
		dp[0][1] = (float) ( ar[0]);
		for(int i = 1; i < n ;i++) {
			for(int j = 0 ; j <= i+1 ; j++) {
				dp[i][j]  = dp[i-1][j]*(1 - ar[i]);
				if(j==0)continue;
				dp[i][j] += dp[i-1][j-1]*(ar[i]);
			}
		}
		float ans = 0 ;
		int min  = (n)/2+1; 
		for(int i  = min ; i<=n;i++) {
			ans+=dp[n-1][i];
		}
  System.out.println(ans);
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
