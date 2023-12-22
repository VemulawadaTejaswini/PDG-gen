import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int[][] dp=new int[n+1][t+3001];
		State[] ss=new State[n];
		for(int i=0; i<n; i++){
			ss[i]=new State(sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(ss);
		for(int i=1; i<=n; i++){
			for(int j=1; j<=t+3000; j++){
				if(j-ss[i-1].a>=t){
					break;
				}
				if(j<ss[i-1].a){
					dp[i][j]=dp[i-1][j];
					continue;
				}
				dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-ss[i-1].a]+ss[i-1].b);
			}
		}
		long ans=0;
		for(int i=0; i<=t+3000; i++){
			ans=Math.max(ans,dp[n][i]);
		}
		System.out.println(ans);
	}
	static class State implements Comparable<State>{
		int a,b;
		State(int a,int b){
			this.a=a;
			this.b=b;
		}
		@Override
 		 public int compareTo(State s){
    		return this.a - s.a;
  		}
	}
}
