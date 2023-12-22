import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long k=sc.nextLong();
		long mod=1000000007;
		long count=0;
		for(int i=1; i<=m; i++){
			count+=((n*n)%mod)*((((m-i+1)*(m-i))/2)%mod);
			count%=mod;
		}
		for(int i=1; i<=n; i++){
			count+=((m*m)%mod)*((((n-i+1)*(n-i))/2)%mod);
			count%=mod;
		}
		System.out.println((count*Combination(n*m-2,k-2,mod))%mod);
	}
	static long Combination(long left,long right,long mod){
		long ans=1;
		right=Math.min(right,left-right);
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
}


