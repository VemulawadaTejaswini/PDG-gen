import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long mod=1000000007;
	static long[] fact;
	static long[] inv;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		long ans=0;
		fact=new long[c2+r2+2];
		fact[1]=1;
		for(int i=2; i<=c2+r2+1; i++){
			fact[i]=(fact[i-1]*i)%mod;
		}
		inv=new long[c2+r2+2];
		inv[c2+r2+1]=pow(fact[c2+r2+1],mod-2);
		for(int i=c2+r2; i>=0; i--){
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
		for(int i=c1; i<=c2; i++){
			ans+=comb(i+r2+1,i+1)-comb(i+r1,i+1)+mod;
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
