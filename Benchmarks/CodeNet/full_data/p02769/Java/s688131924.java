import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long mod=1000000007;
		long ans=C(n+n-1,n-1,mod);
		if(n-2<=k){
		System.out.println(ans);
		}
	}
	static long C(long left,long right,long mod){
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
