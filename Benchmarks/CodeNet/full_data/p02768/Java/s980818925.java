import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long mod=1000000007;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		long ans=(pow(2,n)-1+mod)%mod;
		ans=(ans-C(n,a,mod)+mod)%mod;
		ans=(ans-C(n,b,mod)+mod)%mod;
		System.out.println(ans);
	}
	static long C(long left,long right,long mod){
		long ans=1;
		for(int i=0; i<right; i++){
			ans*=(left-i);
			ans%=mod;
		}
		for(int i=2; i<=right; i++){
			long tmp=mod-2;
			long mul=i;
			while(tmp>0){
				if((tmp&1)==1){
					ans*=mul;
				}
				tmp>>=1;
				mul*=mul;
				ans%=mod;
				mul%=mod;
			}
		}
		return ans;
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
