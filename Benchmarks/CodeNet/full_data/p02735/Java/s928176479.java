import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        
	        int[][] m = new int[H][W];
	        for(int i=0;i<H;i++) {
	        	String S = sc.next();
	        	char[] c=S.toCharArray();
	        	for(int j=0;j<W;j++) {
	        		if(c[j]=='.') {
	        			m[i][j]=0;
	        		} else {
	        			m[i][j]=1;
	        		}	
	        	}
	        }
	        int[][] dp = new int[H][W];
	        dp[0][0]=m[0][0];
	        for(int i=0;i<H;i++) {
	        	for(int j=0;j<W;j++) {
	        		if(i==0&&j==0)continue;
	        		int a1;
	        		if(i==0)a1=99999999;
	        		else {
	        			a1=dp[i-1][j];
		        		if(m[i-1][j]!=m[i][j])a1++;
	        		}
	        		int a2;
	        		if(j==0)a2=99999999;
	        		else {
	        			a2=dp[i][j-1];
		        		if(m[i][j-1]!=m[i][j])a2++;
	        		}
	        		dp[i][j]=Math.min(a1, a2);
	        	}	        			
	        }
	        
	        
	        
	        System.out.println((dp[H-1][W-1]+1)/2);
	        	        	        
	 }
}