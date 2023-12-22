import java.util.*;
import java.io.PrintWriter;
public class Main{
	static ArrayList<Integer>[] map;
	static long[] dp;
	static int[] size;
	static long[] fact;
	static long[] inv;
	static long mod=1000000007;
	static int n;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		combr();
		map=new ArrayList[n];
		dp=new long[n];
		size=new int[n];
		Arrays.fill(size,1);
		for(int i=0; i<n; i++){
			map[i]=new ArrayList<>();
		}
		for(int i=0; i<n-1; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			map[a].add(b);
			map[b].add(a);
		}
		dfs1(0,0);
		dfs2(0,0);
		PrintWriter pw=new PrintWriter(System.out);
		for(int i=0; i<n; i++){
			pw.println(dp[i]);
		}
		pw.flush();
	}
	static void combr(){
		fact=new long[n+1];
		fact[0]=1;
		fact[1]=1;
		for(int i=2; i<=n; i++){
			fact[i]=(fact[i-1]*i)%mod;
		}
		inv=new long[n+1];
		inv[n]=pow(fact[n],mod-2);
		for(int i=n-1; i>=0; i--){
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
	}
	static void dfs1(int now,int from){
		long re=1;
		for(int i:map[now]){
			if(i!=from){
				dfs1(i,now);
				size[now]+=size[i];
				re=re*dp[i]%mod;
				re=re*inv[size[i]]%mod;
			}
		}
		dp[now]=(re*fact[size[now]-1])%mod;
	}
	static void dfs2(int now,int from){
		for(int i:map[now]){
			if(i!=from){
				dp[i]=(dp[i]*(dp[now]*pow(dp[i],mod-2))%mod)%mod;
				dp[i]=dp[i]*fact[size[i]]%mod;
				dp[i]=dp[i]*fact[n-size[i]-1]%mod;
				dp[i]=dp[i]*inv[n-1]%mod;
				dp[i]=dp[i]*comb(n-1,n-size[i])%mod;
				dfs2(i,now);
			}
		}
	}
	static long pow(long p,long q){
		long res=1;
		while(q>0){
			if((q & 1)==1){
				res*=p;
				res%=mod;
			}
			q>>=1;
			p*=p;
			p%=mod;
		}
		return res;
	}
	static long comb(int t,int y){
		long re=1;
		re*=fact[t];
		re*=inv[y];
		re%=mod;
		re*=inv[t-y];
		return re%mod;
	}
}
