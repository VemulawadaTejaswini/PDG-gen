import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long[] fact;
	static long[] inv;
	static long mod=1000000007;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=Math.min(n-1,sc.nextInt());
		fact=new long[2*n+1];
		fact[0]=1;
		fact[1]=1;
		for(int i=2; i<=2*n; i++){
			fact[i]=(fact[i-1]*i)%mod;
		}
		inv=new long[2*n+1];
		inv[2*n]=pow(fact[2*n],mod-2);
		for(int i=2*n-1; i>=0; i--){
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
		long ans=1;
		for(int i=1; i<=k; i++){
			ans+=comb(n,i)*comb(n-1,n-1-i);
			ans%=mod;
		}
		System.out.println(ans);
	}
	static long comb(int t,int y){
		long re=1;
		re*=fact[t];
		re*=inv[y];
		re%=mod;
		re*=inv[t-y];
		return re%mod;
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

}
