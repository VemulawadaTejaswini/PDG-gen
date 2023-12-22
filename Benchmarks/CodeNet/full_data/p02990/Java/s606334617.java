import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int k=sc.nextInt();
		long mod=1000000007;
		int a=Math.min(k,n-k+1);
		long ans=0;
		for(int i=1; i<=a; i++){
			ans=C(n-k+1,i,mod)*C(k-1,i-1,mod);
			System.out.println(ans);
		}
		for(int i=0; i<k-a; i++){
			System.out.println(0);
		}
	}
	static long C(long left,long right,long mod){
		if(right==0){
			return 1;
		}
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


