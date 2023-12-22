/*					                                
										   *                             *
		                                    *             * * * * * * * *
		                                    *             *
		                                    *             *
		                                    *             *
		                                    *             *
		                                    *             *
		                                    *             *
		                                    * * * * * * * * * * * * * * *
		                                                  *             *
		                                                  *             *
		                                                  *             *
		                                                  *             *
		                                                  *             *
		                                                  *             *
		                                    * * * * * * * *             *
		                                   *                             *                             
*/
import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
	public int dp[][];
	public Main(int m,int n) {
		this.dp=new int[m+1][n+1];
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				dp[i][j]=-1;
			}
		}
	}
	public String lcs(String text1,String text2,int m,int n) {
		int temp=this.solve(text1, text2, m, n);
		String common="";
		int target=1;
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(this.dp[i][j]==target) {
					common=common+text2.charAt(j-1);
					target++;
				}
			}
		}
		return common;
	}
	public int solve(String s1,String s2,int x,int y) {
		if(x==0 || y==0)
			return this.dp[x][y];
		else if(dp[x][y]!=-1)
			return this.dp[x][y];
		else {
			if(s1.charAt(x-1)==s2.charAt(y-1)){
				this.dp[x][y]=1+this.solve(s1,s2,x-1,y-1);
				return this.dp[x][y];
			}
			else {
				this.dp[x][y]=Math.max(this.solve(s1,s2,x,y-1),this.solve(s1,s2,x-1,y));
				return this.dp[x][y];
			}
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int m=s.length();
		int n=t.length();
		Main obj=new Main(m,n);
		String ans=obj.lcs(s,t,m,n);
		System.out.println(ans);
	}
}